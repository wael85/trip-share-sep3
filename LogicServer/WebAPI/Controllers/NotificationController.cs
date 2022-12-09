using Application.LogicInterfaces;
using Domain.DTOs;
using Domain.Model;
using Microsoft.AspNetCore.Authorization;
using Microsoft.AspNetCore.Mvc;

namespace WebAPI.Controllers;
[ApiController]
[Route("[Controller]")]
[Authorize]
public class NotificationController : ControllerBase
{
    private readonly INotificationLogic _notificationLogic;

    public NotificationController(INotificationLogic notificationLogic)
    {
        _notificationLogic = notificationLogic;
    }

    [HttpPost]
    public async Task<ActionResult<int>> RequestSeatAsync([FromBody] NotificationDto notification)
    {
        try
        {
            int n = await _notificationLogic.CreateNotificationAsync(notification);
            return Accepted(n);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, "Notification not created.");
        }
    }
    [HttpGet]
    [Route("")]
    public async Task<ActionResult<IEnumerable<Notification>>> GetUserNotification([FromQuery] string id)
    {
        try
        {
            IEnumerable<Notification> notifications = await _notificationLogic.GetUserActiveNotificationsAsync(id);
            return Ok(notifications);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }

    }
    
}