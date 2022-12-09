using System.Net;
using System.Net.Http.Json;
using System.Text.Json;
using Domain.DTOs;
using Domain.Model;
using HttpClient.ClientInterfaces;

namespace HttpClient.ClientImplementation;

public class HttpNotificationClient : INotificationClient
{
    private readonly  System.Net.Http.HttpClient client;

    public HttpNotificationClient(System.Net.Http.HttpClient client)
    {
        this.client = client;
    }

    public async Task<string> SaveRequestAsync(NotificationDto dto)
    {
        var response = await client.PostAsJsonAsync("/notification",dto);
        var result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception("Can not send this request, Please Check your input");
        }
      
        return "Success!!";
    }

    public async Task<IEnumerable<Notification>> GetUserNotification(string userId)
    {
        var response = await client.GetAsync($"/Notification?id={userId}");
        var result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }
        var reply =  JsonSerializer.Deserialize<IEnumerable<Notification>>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;
        return await Task.FromResult(reply);
    }
}