using System.Net.Http.Json;
using System.Text.Json;
using Domain.DTOs;
using Domain.Model;
using HttpClient.ClientInterfaces;

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

    public async Task<IEnumerable<Trip>> GetTripsByUserIdAsync(string id)
    {
        var response = await client.GetAsync($"/trips/{id}");
        string content = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(content);
        }
        ICollection<Trip> trips = JsonSerializer.Deserialize<ICollection<Trip>>(content, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;
        
        return trips;
    }
}