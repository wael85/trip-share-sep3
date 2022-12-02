package via.sep3.grpcserver.services;

import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import via.sep3.grpcserver.Entities.SeatTicket;
import via.sep3.grpcserver.Entities.User;
import via.sep3.grpcserver.protobuf.ticketservices.*;
import via.sep3.grpcserver.repositorys.SeatTicketRepository;
import via.sep3.grpcserver.repositorys.UserRepository;

import java.util.List;
import java.util.Optional;
import java.util.TimeZone;

@GRpcService
public class SeatTicketService extends TicketServicesGrpc.TicketServicesImplBase {

    SeatTicketRepository ticketRepository;
    UserRepository userRepository;

    public SeatTicketService(SeatTicketRepository ticketRepository, UserRepository userRepository) {
        this.ticketRepository = ticketRepository;
        this.userRepository = userRepository;
    }

    @Override
    public void getAllUserTicket(TicketsByUserId request, StreamObserver<TicketsByTripResponse> response){
        String email =request.getEmail();
        Optional<User> p = userRepository.findByEmail(email);

       Optional<List<SeatTicket>> seatTicketList= Optional.ofNullable(ticketRepository.getSeatTicketsByPassenger(p.get()));
        TicketsByTripResponse.Builder builder =TicketsByTripResponse.newBuilder();
        for (var t:seatTicketList.get()) {
            LocationMessage pickUp = LocationMessage.newBuilder().setId(t.getPickUpLocation().getId())
                            .setPostCode(t.getPickUpLocation().getPostCode()).setCity(t.getPickUpLocation().getCity())
                            .setStreetName(t.getPickUpLocation().getStreetName()).setStreetNumber(t.getPickUpLocation().getStreetNumber())
                            .setArrivalTime(t.getPickUpLocation().getArrivalTime()
                                    .toEpochSecond(TimeZone.getDefault().toZoneId().getRules().getOffset(t.getPickUpLocation().getArrivalTime()))).build();

            LocationMessage drop = LocationMessage.newBuilder().setId(t.getDropLocation().getId())
                    .setPostCode(t.getDropLocation().getPostCode()).setCity(t.getDropLocation().getCity())
                    .setStreetName(t.getDropLocation().getStreetName()).setStreetNumber(t.getDropLocation().getStreetNumber())
                    .setArrivalTime(t.getDropLocation().getArrivalTime()
                            .toEpochSecond(TimeZone.getDefault().toZoneId().getRules().getOffset(t.getDropLocation().getArrivalTime()))).build();

            builder.addTickets(SeatTicketResponse.newBuilder().setId(t.getId()).setSeatPrice(t.getSeatPrice())
                    .setTotalSeats(t.getTotalSeats()).setPassengerId(t.getPassenger().getEmail()).setTripId(t.getTrip().getId())
                    .setPickup(pickUp).setDropoff(drop).build());
        }

        response.onNext(builder.build());
        response.onCompleted();
    }

}
