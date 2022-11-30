
package via.sep3.grpcserver.services;

import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;
import via.sep3.grpcserver.Entities.Location;
import via.sep3.grpcserver.Entities.Trip;
import via.sep3.grpcserver.protobuf.tripservices.*;
import via.sep3.grpcserver.repositorys.LocationRepository;
import via.sep3.grpcserver.repositorys.TripRepository;
import via.sep3.grpcserver.repositorys.UserRepository;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
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
                    .setArrivalTime(location.getArrivalTime().toEpochSecond(TimeZone.getDefault().toZoneId().getRules().getOffset(location.getArrivalTime())))
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

    private List<Location> createLocations (List<TripCreationRequest.Location> stops, Trip trip) {
        List<Location> locations = new ArrayList<>();
        for (TripCreationRequest.Location stop : stops) {
            Location location = new Location();
            location.setTrip(trip);
            location.setCity(stop.getCity());
            location.setArrivalTime(LocalDateTime.ofInstant(Instant.ofEpochMilli(stop.getArrivalTime()),
                                        TimeZone.getDefault().toZoneId()));
            location.setPostCode(stop.getPostCode());
            location.setStreetName(stop.getStreetName());
            location.setStreetNumber(stop.getStreetNumber());

            locations.add(location);
        }
        locationRepository.saveAll(locations);
        return locations;
    }

    @Override
    public void getTripsByUserID(TripsByDriverIDRequest request, StreamObserver<TripsByDriverIDResponse> responseObserver) {
        super.getTripsByUserID(request, responseObserver);
    }
}

