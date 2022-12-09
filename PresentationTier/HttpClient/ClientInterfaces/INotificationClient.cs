using Domain.DTOs;
using Domain.Model;

namespace HttpClient.ClientInterfaces;

public interface INotificationClient
{
    Task <string> CreateRequestAsync(NotificationDto dto);
    Task<IEnumerable<Notification>> GetUserNotification(string userId);
}