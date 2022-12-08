using Application.GrpcInterfaces;
using Application.LogicInterfaces;
using Domain.DTOs;
using Domain.Model;

namespace Application.Logic;

public class NotificationLogic : INotificationLogic 
{
    private readonly INotificationGrpcService _notificationGrpcService;

    public NotificationLogic(INotificationGrpcService notificationGrpcService)
    {
        _notificationGrpcService = notificationGrpcService;
    }

    public async Task<int> CreateNotificationAsync(NotificationDto n)
    {
        return await _notificationGrpcService.CreateRequestNotificationAsync(n);
    }

    public async Task<IEnumerable<Notification>> GetUserActiveNotificationsAsync(string userEmail)
    {
        return await _notificationGrpcService.GetUserActiveNotificationsAsync(userEmail);
    }
}