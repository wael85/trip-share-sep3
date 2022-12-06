
package via.sep3.grpcserver.services;

import io.grpc.Metadata;
import io.grpc.protobuf.ProtoUtils;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;
import via.sep3.grpcserver.Entities.Location;
import via.sep3.grpcserver.Entities.SeatTicket;
import via.sep3.grpcserver.Entities.Trip;
import via.sep3.grpcserver.Entities.User;
import via.sep3.grpcserver.protobuf.carservices.ErrorResponse;
import via.sep3.grpcserver.protobuf.ticketservices.*;
import via.sep3.grpcserver.repositorys.SeatTicketRepository;
import via.sep3.grpcserver.repositorys.TripRepository;
import via.sep3.grpcserver.repositorys.UserRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@GRpcService
public class SeatTicketService extends TicketServicesGrpc.TicketServicesImplBase {

    SeatTicketRepository ticketRepository;
    UserRepository userRepository;
    TripRepository tripRepository;

    @Autowired
    public SeatTicketService(SeatTicketRepository ticketRepository, UserRepository userRepository,TripRepository tripRepository) {
        this.ticketRepository = ticketRepository;
        this.userRepository = userRepository;
        this.tripRepository=tripRepository;
    }

    @Transactional
    @Override
    public void deleteById(TicketIdMessage request, StreamObserver<TicketEmptyMessage> responseObserver) {
        Long id =request.getId();
         Optional<SeatTicket> seatTicket= ticketRepository.findById(id);

         ticketRepository.delete(seatTicket.get());

        responseObserver.onNext(TicketEmptyMessage.newBuilder().build());
        responseObserver.onCompleted();

    }

    @Override
    public void getAllUserTicket(TicketsByUserId request, StreamObserver<TicketsResponse> response){
        String email =request.getEmail();
        Optional<User> p = userRepository.findByEmail(email);

       Optional<List<SeatTicket>> seatTicketList= Optional.ofNullable(ticketRepository.getSeatTicketsByPassenger(p.get()));
        TicketsResponse.Builder builder =TicketsResponse.newBuilder();
        for (var t:seatTicketList.get()) {
            LocationMessage pickUp = buildLocationMessage(t.getPickUpLocation());

            LocationMessage drop = buildLocationMessage(t.getDropLocation());

            builder.addTickets(SeatTicketResponse.newBuilder().setId(t.getId()).setSeatPrice(t.getSeatPrice())
                    .setTotalSeats(t.getTotalSeats()).setPassengerId(t.getPassenger().getEmail()).setTripId(t.getTrip().getId())
                    .setPickup(pickUp).setDropoff(drop).build());
        }

        response.onNext(builder.build());
        response.onCompleted();
    }

    @Transactional
    @Override
    public void createTicket(SeatTicketCreationRequest request, StreamObserver<SeatTicketResponse> responseObserver) {
        Optional<Trip> trip = tripRepository.findById(request.getTripId());
        if (trip.isEmpty()){
           Metadata metadata =errorResponse("Trip is not available");
            responseObserver.onError(io.grpc.Status.INVALID_ARGUMENT.withDescription("Trip is not available anymore")
                    .asRuntimeException(metadata));
        }else {

            Optional<User> user = userRepository.findById(request.getPassengerId());
            Location pickUp = new Location();
            Location dropOff = new Location();
            for (var t : trip.get().getStops()) {
                if (t.getId() == request.getPickupId()) {
                    pickUp = t;
                }
                if (t.getId() == request.getDropoffId()) {
                    dropOff = t;
                }
            }
            SeatTicket seatTicket = new SeatTicket();
            seatTicket.setTrip(trip.get());
            seatTicket.setPassenger(user.get());
            seatTicket.setSeatPrice(request.getSeatPrice());
            seatTicket.setTotalSeats(request.getTotalSeats());
            seatTicket.setDropLocation(dropOff);
            seatTicket.setPickUpLocation(pickUp);

            SeatTicket replay = ticketRepository.save(seatTicket);

            LocationMessage start = buildLocationMessage(replay.getPickUpLocation());
            LocationMessage end = buildLocationMessage(replay.getDropLocation());
            SeatTicketResponse ticketResponse = SeatTicketResponse.newBuilder().setId(replay.getId()).setSeatPrice(replay.getSeatPrice())
                    .setPassengerId(replay.getPassenger().getEmail()).setTripId(replay.getTrip().getId()).setPickup(start).setDropoff(end).build();

            responseObserver.onNext(ticketResponse);
            responseObserver.onCompleted();
        }
    }

    private synchronized LocationMessage buildLocationMessage(Location location){
        return LocationMessage.newBuilder().setId(location.getId())
                .setPostCode(location.getPostCode()).setCity(location.getCity())
                .setStreetName(location.getStreetName()).setStreetNumber(location.getStreetNumber())
                .setArrivalTime(location.getArrivalTime().toString()).build();
    }
    private synchronized Metadata errorResponse(String message){
        Metadata.Key<TicketErrorResponse> errorResponseKey = ProtoUtils.keyForProto(TicketErrorResponse.getDefaultInstance());
        TicketErrorResponse errorResponse = TicketErrorResponse.newBuilder()
                .setMessage(message)
                .setStatus(400)
                .build();
        Metadata metadata = new Metadata();
        metadata.put(errorResponseKey, errorResponse);
        return metadata;
    }

}

