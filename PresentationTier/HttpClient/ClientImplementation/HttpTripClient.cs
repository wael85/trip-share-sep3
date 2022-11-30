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


    public async Task<Trip> CreateTripAsync(TripCreationDto dto)
    {
        var response = await client.PostAsJsonAsync("/trips", dto);
        var result = await response.Content.ReadAsStringAsync();
        
        if (!response.IsSuccessStatusCode)
        {
            
            Console.WriteLine("something wrong");
            throw new Exception(result);
        }
        
        var serialOpt = new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        };
        Console.WriteLine("success");

        Trip t = JsonSerializer.Deserialize<Trip>(result, serialOpt)!;
        Console.WriteLine(t.Id);
        return t;
    }

    public Task<IEnumerable<Trip>> GetAllTripAsync()
    {
        throw new NotImplementedException();
    }
}