package via.sep3.grpcserver.services;

import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

import via.sep3.grpcserver.protobuf.notificationservices.*;
import via.sep3.grpcserver.repositorys.LocationRepository;
import via.sep3.grpcserver.repositorys.NotificationRepository;
import via.sep3.grpcserver.Entities.Notification;
import via.sep3.grpcserver.repositorys.TripRepository;
import via.sep3.grpcserver.repositorys.UserRepository;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.OptionalInt;

@GRpcService
public class NotificationService extends NotificationServicesGrpc.NotificationServicesImplBase {
    private final NotificationRepository notificationRepository;
    private final UserRepository userRepository;
    private final LocationRepository locationRepository;
    private final TripRepository tripRepository;

    public NotificationService(NotificationRepository notificationRepository,
                               UserRepository userRepository, LocationRepository locationRepository,
                               TripRepository tripRepository
    ) {
        this.notificationRepository = notificationRepository;
        this.userRepository = userRepository;
        this.locationRepository = locationRepository;
        this.tripRepository = tripRepository;
    }


    @Override
    public void createRequestNotification(RequestSeatNotification request , StreamObserver<ResponseSeatNotification> respons){
        Notification existed  = notificationRepository.getById(request.getNotificationId()).get();
        Notification n = new Notification();
        if(existed != null){
            n.setId(existed.getId());
        }
        n.setId(request.getNotificationId());
        n.setMsg(request.getMsg());
        n.setSeatPrice(request.getSeatPrice());
        n.setConsumer(userRepository.findByEmail(request.getConsumerId()).get());
        n.setSender(userRepository.findByEmail(request.getSenderId()).get());
        n.setRequestedPickUpLocation(locationRepository.findById((long) request.getRequestedPickupLocationId()).get());
        n.setRequestedDropLocation(locationRepository.findById((long) request.getRequestedDropLocationId()).get());
        n.setSeatCount(request.getSeatCount());
        n.setRequestedTrip(tripRepository.getReferenceById((long)request.getTripId()));
        n.setConsumed(request.getConsumed());
        Notification returnN = notificationRepository.save(n);
        ResponseSeatNotification res = ResponseSeatNotification.newBuilder().setResponseCode(200)
                .setResponseMsg("Success")
                .build();
        respons.onNext(res);
        respons.onCompleted();
    }
    @Override
    public void getNotification(RequestGetMyNotifications request , StreamObserver<ResponseActiveNotifications> response){
        ArrayList<Notification> notificationList = notificationRepository.findAllByConsumerAndConsumedIsFalse(userRepository.findByEmail(request.getConsumerId()).get());
        ResponseActiveNotifications.Builder mainBuilder = ResponseActiveNotifications.newBuilder();
       notificationList.forEach(notification -> {
           ReturnedNotification.Builder subBuilder = ReturnedNotification.newBuilder()
                   .setId(notification.getId())
                   .setMsg(notification.getMsg())
                   .setConsumerId(notification.getConsumer().getEmail())
                   .setSenderId(notification.getSender().getEmail())
                   .setSeatPrice(notification.getSeatPrice())
                   .setSeatCount(notification.getSeatCount())
                   .setTripId((int) notification.getRequestedTrip().getId())
                   .setRequestedPickupLocationId(Location.newBuilder()
                           .setId(notification.getRequestedPickUpLocation().getId())
                           .setCity(notification.getRequestedPickUpLocation().getCity())
                           .setArrivalTime(notification.getRequestedPickUpLocation().getArrivalTime().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")))
                           .setPostCode(notification.getRequestedPickUpLocation().getPostCode())
                           .setStreetName(notification.getRequestedPickUpLocation().getStreetName())
                           .setStreetNumber(notification.getRequestedPickUpLocation().getStreetNumber())
                           .build())
                   .setRequestedDropLocationId(Location.newBuilder()
                           .setId(notification.getRequestedDropLocation().getId())
                           .setCity(notification.getRequestedDropLocation().getCity())
                           .setArrivalTime(notification.getRequestedDropLocation().getArrivalTime().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")))
                           .setPostCode(notification.getRequestedDropLocation().getPostCode())
                           .setStreetName(notification.getRequestedDropLocation().getStreetName())
                           .setStreetNumber(notification.getRequestedDropLocation().getStreetNumber())
                           .build());

           mainBuilder.addNotifications(subBuilder);
       });
       ResponseActiveNotifications res = mainBuilder.build();
       response.onNext(res);
       response.onCompleted();

    }
}

