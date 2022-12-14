using System.Reflection;
using Application.GrpcInterfaces;
using Domain.DTOs;
using Domain.Model;
using Google.Protobuf.WellKnownTypes;

namespace gRPCClient.gRPC_Imp;

public class NotificationGrpcImp : INotificationGrpcService
{
    private readonly NotificationServices.NotificationServicesClient client;
    private readonly ITripServices _tripServices;

    public NotificationGrpcImp(NotificationServices.NotificationServicesClient client)
    {
        this.client = client;
    }

    public async Task<int> CreateRequestNotificationAsync(NotificationDto n)
    {
        // returned 200 on success
        RequestSeatNotification request = new RequestSeatNotification
        {
            Consumed = n.Consumed,
            ConsumerId = n.Consumer,
            SenderId = n.Sender,
            Msg = n.Msg,
            SeatPrice = n.SeatPrice,
            SeatCount = n.SeatCount,
            TripId = n.RequestedTripId,
            RequestedDropLocationId = n.RequestedDropUpLocation,
            RequestedPickupLocationId = n.RequestedPickUpLocation
        };
        if (n.GetType().GetTypeInfo().GetDeclaredProperty("Id") != null)
        {
            request.NotificationId = n.Id;
        }         
       
        ResponseSeatNotification res =  client.createRequestNotification(request);
        return await Task.FromResult(res.ResponseCode);
    }

    public async Task<IEnumerable<Notification>> GetUserActiveNotificationsAsync(string userEmail)
    {
        RequestGetMyNotifications request = new RequestGetMyNotifications
        {
            ConsumerId = userEmail
        };
        ResponseActiveNotifications res = client.getNotification(request);
        List<Notification> notifications = new List<Notification>();
        foreach (var n in res.Notifications)
        {
            Notification notification = new Notification
            {
                Id = n.Id,
                Consumer = n.ConsumerId,
                Sender = n.SenderId,
                Msg = n.Msg,
                RequestedPickUpLocation = new Location
                {
                    Id = n.RequestedPickupLocationId.Id,
                    ArrivalTime = DateTime.Parse(n.RequestedPickupLocationId.ArrivalTime),
                    City = n.RequestedPickupLocationId.City,
                    PostCode = n.RequestedPickupLocationId.PostCode,
                    StreetName = n.RequestedPickupLocationId.StreetName,
                    StreetNumber = n.RequestedPickupLocationId.StreetNumber
                },
                RequestedDropUpLocation = new Location
                {
                    Id = n.RequestedDropLocationId.Id,
                    ArrivalTime = DateTime.Parse(n.RequestedDropLocationId.ArrivalTime),
                    City = n.RequestedDropLocationId.City,
                    PostCode = n.RequestedDropLocationId.PostCode,
                    StreetName = n.RequestedDropLocationId.StreetName,
                    StreetNumber = n.RequestedDropLocationId.StreetNumber
                },
                Consumed = false,
                RequestedTripId = n.TripId,
                SeatPrice = n.SeatPrice,
                SeatCount = n.SeatCount

            };
            notifications.Add(notification);
        }

        return await Task.FromResult<IEnumerable<Notification>>(notifications);
    }
}