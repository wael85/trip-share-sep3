using System.Net.Http.Json;
using System.Text.Json;
using Domain.DTOs;
using Domain.Model;

namespace HttpClient.ClientImplementation;

public class HttpTripClient :  ITripClient
{
    private readonly System.Net.Http.HttpClient client;

    public HttpTripClient(System.Net.Http.HttpClient tripClient)
    {
        this.client = tripClient;
    }


    public async Task<Trip> CreateTripAsync(Trip trip)
    {
        var response = await client.PostAsJsonAsync("/trips", trip);
        var result = await response.Content.ReadAsStringAsync();
        
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }
        
        var serialOpt = new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        };
        return JsonSerializer.Deserialize<Trip>(result, serialOpt)!;
    }

    public Task<IEnumerable<Trip>> GetAllTripAsync()
    {
        throw new NotImplementedException();
    }
}