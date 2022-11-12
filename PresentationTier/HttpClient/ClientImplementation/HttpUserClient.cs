using System.Net.Http.Json;
using System.Runtime.InteropServices;
using System.Text.Json;
using Domain.DTOs;
using Domain.Model;

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
}