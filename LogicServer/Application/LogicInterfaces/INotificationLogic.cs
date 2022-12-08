using Domain.DTOs;
using Domain.Model;

namespace Application.LogicInterfaces;

public interface INotificationLogic
{
    Task<int> CreateNotificationAsync(NotificationDto n);
    Task<IEnumerable<Notification>> GetUserActiveNotificationsAsync(string userEmail);

}