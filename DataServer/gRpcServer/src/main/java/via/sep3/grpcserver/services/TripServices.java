

package via.sep3.grpcserver.services;

import io.grpc.Metadata;
import io.grpc.protobuf.ProtoUtils;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;
import via.sep3.grpcserver.Entities.Location;
import via.sep3.grpcserver.Entities.Trip;
import via.sep3.grpcserver.protobuf.carservices.ErrorResponse;
import via.sep3.grpcserver.protobuf.tripservices.*;
import via.sep3.grpcserver.repositorys.LocationRepository;
import via.sep3.grpcserver.repositorys.TripRepository;
import via.sep3.grpcserver.repositorys.UserRepository;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.TimeZone;

@GRpcService
public class TripServices extends TripServicesGrpc.TripServicesImplBase {
    private final TripRepository tripRepository;
    private final UserRepository userRepository;
    private final LocationRepository locationRepository;

    @Autowired
    public TripServices(TripRepository tripRepository, UserRepository userRepository, LocationRepository locationRepository) {
        this.tripRepository = tripRepository;
        this.userRepository = userRepository;
        this.locationRepository = locationRepository;
    }

    @Override
    public void createTrip(TripCreationRequest request, StreamObserver<TripResponse> responseObserver) {
        Trip trip = new Trip();

        trip.setFullPrice((int) request.getFullPrice());
        trip.setAvailableSeats(request.getAvailableSeats());
        trip.setDriver(userRepository.findByEmail(request.getDriverId()).get());

        var locations = createLocations(request.getStopsList(), trip);
        List<TripResponse.Location> locationResults = new ArrayList<>();
        tripRepository.save(trip);

        for (Location location : locations) {
            var locationResult = TripResponse.Location.newBuilder()
                    .setId(location.getId())
                    .setArrivalTime(location.getArrivalTime().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")))
                    .setPostCode(location.getPostCode())
                    .setCity(location.getCity())
                    .setStreetName(location.getStreetName())
                    .setStreetNumber(location.getStreetNumber())
                    .build();
            locationResults.add(locationResult);
        }

        TripResponse tripResponse = TripResponse.newBuilder()
                .setId(trip.getId())
                .setAvailableSeats(trip.getAvailableSeats())
                .setFullPrice(trip.getFullPrice())
                .setDriverId(request.getDriverId())
                .addAllStops(locationResults)
                .build();

        responseObserver.onNext(tripResponse);
        responseObserver.onCompleted();
    }

    private List<Location> createLocations(List<TripCreationRequest.Location> stops, Trip trip) {
        List<Location> locations = new ArrayList<>();
        for (TripCreationRequest.Location stop : stops) {
            Location location = new Location();
            location.setTrip(trip);
            location.setCity(stop.getCity());
            location.setArrivalTime(LocalDateTime.parse(stop.getArrivalTime(), DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));
            location.setPostCode(stop.getPostCode());
            location.setStreetName(stop.getStreetName());
            location.setStreetNumber(stop.getStreetNumber());

            locations.add(location);
        }
        locationRepository.saveAll(locations);
        return locations;
    }

    @Override
    public void getAllTrips(Emptymessage request, StreamObserver<TripsByDriverIDResponse> responseObserver) {
        List<Trip> trips = tripRepository.findAll();

        List<TripsByDriverIDResponse> responses = new ArrayList<>();
        List<TripResponse.Location> locations = new ArrayList<>();


        var tripsByDriverIDResponse = TripsByDriverIDResponse.newBuilder();
        for (Trip trip : trips) {
            Optional<List<Location>> stops = locationRepository.getAllByTripId(trip.getId());

            var tripResponse = TripResponse.newBuilder()
                    .setAvailableSeats(trip.getAvailableSeats())
                    .setDriverId(trip.getDriver().getEmail())
                    .setFullPrice(trip.getFullPrice())
                    .setId(trip.getId());

            for (Location l : stops.get()) {
                if (l.getTrip().getId() == trip.getId()) {
                    TripResponse.Location res = TripResponse.Location.newBuilder()
                            .setArrivalTime(l.getArrivalTime().toString())
                            .setCity(l.getCity())
                            .setId(l.getId())
                            .setPostCode(l.getPostCode())
                            .setStreetName(l.getStreetName())
                            .setStreetNumber(l.getStreetNumber())
                            .build();
                    locations.add(res);

                    tripResponse.addAllStops(locations);

                }
                locations = new ArrayList<>();


            }


            TripResponse tripResponse1 = tripResponse.build();


            tripsByDriverIDResponse.addTrips(tripResponse1);

        }
        TripsByDriverIDResponse response = tripsByDriverIDResponse.build();
        responses.add(response);
        responseObserver.onNext(response);
        responseObserver.onCompleted();

    }


    @Override
    public void getTripsByUserID(TripsByDriverIDRequest request, StreamObserver<TripsByDriverIDResponse> responseObserver) {
        String email = request.getUserId();
        Optional<List<Trip>> userTrips = tripRepository.GetUsersTripsByUserId(email);
        System.out.println(userTrips.get());
        List<TripResponse.Location> locations = new ArrayList<>();
        var response = TripsByDriverIDResponse.newBuilder();
        for (Trip t : userTrips.get()) {
            Optional<List<Location>> stops = locationRepository.getAllByTripId(t.getId());
            var tripResponse = TripResponse.newBuilder()
                    .setId(t.getId())
                    .setFullPrice(t.getFullPrice())
                    .setDriverId(t.getDriver().getEmail())
                    .setAvailableSeats(t.getAvailableSeats());
            for (Location l : stops.get()) {
                if (l.getTrip().getId() == t.getId()) {
                    TripResponse.Location res = TripResponse.Location.newBuilder()
                            .setArrivalTime(l.getArrivalTime().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")))
                            .setCity(l.getCity())
                            .setId(l.getId())
                            .setPostCode(l.getPostCode())
                            .setStreetName(l.getStreetName())
                            .setStreetNumber(l.getStreetNumber())
                            .build();
                    locations.add(res);

                    tripResponse.addAllStops(locations);

                }
                locations = new ArrayList<>();


            }
            TripResponse tripResponse1 = tripResponse.build();
            response.addTrips(tripResponse1);


        }
        TripsByDriverIDResponse response1 = response.build();
        responseObserver.onNext(response1);
        responseObserver.onCompleted();
    }
}



