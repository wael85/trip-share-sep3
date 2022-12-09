using System.Net.Http.Headers;
using System.Net.Http.Json;
using System.Text.Json;
using Domain.DTOs;
using Domain.Model;
using HttpClient.ClientInterfaces;

namespace HttpClient.ClientImplementation;

public class HttpCarClient : ICarClient
{
    private readonly System.Net.Http.HttpClient client;

    public HttpCarClient(System.Net.Http.HttpClient client)
    {
        this.client = client;
    }

    public async Task<Car> CreateAsync(BeADriverRequestDto dto)
    {
        var response = await client.PostAsJsonAsync("cars",dto);
        var result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }

        var car = JsonSerializer.Deserialize<Car>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        });
        return car;

    }

    public async Task<Car> Verify(string plateNumber)
    {

        var response = await client.GetAsync($"cars/verify?plateNumber={plateNumber}");
        var result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)

        {
            throw new Exception(result);

        }

        var car = JsonSerializer.Deserialize<Car>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        });
        return car;
    }
}