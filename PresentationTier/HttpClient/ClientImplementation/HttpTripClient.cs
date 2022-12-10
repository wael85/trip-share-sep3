using System.Globalization;
using System.Net.Http.Headers;
using System.Net.Http.Json;
using System.Text.Json;
using Domain.DTOs;
using Domain.Model;
using HttpClient.ClientInterfaces;

namespace HttpClient.ClientImplementation;

public class HttpTripClient :  ITripClient
{
    private System.Net.Http.HttpClient client;

    public HttpTripClient(System.Net.Http.HttpClient client)
    {
        this.client = client;
    }
    
    public async Task<Trip> CreateTripAsync(TripCreationDto dto)
    {
        client.DefaultRequestHeaders.Authorization = new AuthenticationHeaderValue("Bearer",JwtAuthService.Jwt);

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

        var t = JsonSerializer.Deserialize<Trip>(result, serialOpt)!;
        Console.WriteLine(t.Id);
        return t;
    }

    public async Task<List<Trip>> GetAllTripAsync()
    {
        client.DefaultRequestHeaders.Authorization = new AuthenticationHeaderValue("Bearer",JwtAuthService.Jwt);

        var response = await client.GetAsync(
            $"/trips");
        var result = await response.Content.ReadAsStringAsync();
        if (response.IsSuccessStatusCode)
        {
            var trips = JsonSerializer.Deserialize<List<Trip>>(result,new JsonSerializerOptions
            {
                PropertyNameCaseInsensitive = true
            })!;
            return trips;
        }
        throw new Exception(result);
    }

    public async Task<List<Trip>> GetTripsByUserIdAsync(string id)
    {
        client.DefaultRequestHeaders.Authorization = new AuthenticationHeaderValue("Bearer",JwtAuthService.Jwt);

        var response = await client.GetAsync($"/user-trips?email={id}");
        var content = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(content);
        }
        var trips = JsonSerializer.Deserialize<List<Trip>>(content, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;
        
        return trips;
    }

    public async Task<List<Trip>> GetTripsAsync(TripSearchQuery searchQuery)
    {
        client.DefaultRequestHeaders.Authorization = new AuthenticationHeaderValue("Bearer",JwtAuthService.Jwt);

        var response = await client.GetAsync(
            $"/Trips" + MakeSearchQuery(searchQuery));
        string result = await response.Content.ReadAsStringAsync();
        if (response.IsSuccessStatusCode)
        {
            var trips = JsonSerializer.Deserialize<List<Trip>>(result,new JsonSerializerOptions
            {
                PropertyNameCaseInsensitive = true
            })!;
            return trips;
        }
        throw new Exception(result);
    }

    private static string MakeSearchQuery(TripSearchQuery dto)
    {
        
        var query = $"?PassengerAmount={dto.PassengerAmount}&TripDateTime={dto.TripDateTime.ToString(new DateTimeFormatInfo().SortableDateTimePattern)}";

        if (dto.Pickup != "" && dto.Dropoff != "")
            query += $"&Pickup={dto.Pickup}&Dropoff={dto.Dropoff}";

        if (dto.MaxPrice > 0)
            query += $"&MaxPrice={dto.MaxPrice}";
        
        Console.WriteLine(query);
        return query;
    }
}