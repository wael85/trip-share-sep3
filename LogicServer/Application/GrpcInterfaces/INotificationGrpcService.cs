using Domain.DTOs;
using Domain.Model;

namespace Application.GrpcInterfaces;

public interface INotificationGrpcService
{
    Task<int> CreateRequestNotificationAsync(NotificationDto n);
    Task<IEnumerable<Notification>> GetUserActiveNotificationsAsync(string userEmail);
    
}