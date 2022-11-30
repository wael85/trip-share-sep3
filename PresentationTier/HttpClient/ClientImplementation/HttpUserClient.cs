using System.Net.Http.Json;
using System.Text.Json;
using Domain.DTOs;
using Domain.Model;
using HttpClient.ClientInterfaces;
using SysHttpClient = System.Net.Http.HttpClient; // Conflicts with the namespace otherwise.

namespace HttpClient.ClientImplementation;

public class UserClientImp : IUserClient
{
    private SysHttpClient client;

    public UserClientImp(SysHttpClient client)
    {
        this.client = client;
    }
    
    public async Task<ReturnedUserDTO> CreateAsync(User user)
    {
        var response = await client.PostAsJsonAsync("/users", user);
        var result = await response.Content.ReadAsStringAsync();
        
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }
        
        var serialOpt = new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        };
        return JsonSerializer.Deserialize<ReturnedUserDTO>(result, serialOpt)!;
    }

    public async Task<ReturnedUserDTO> GetByIdAsync(string id)
    {
        
        
        var response = await client.GetAsync($"/users/{id}");
        
        var content =  await response.Content.ReadAsStringAsync();
        
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(content);
        }

        var reply =  JsonSerializer.Deserialize<ReturnedUserDTO>(content, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;
        
        
       

        return reply;

    }
}