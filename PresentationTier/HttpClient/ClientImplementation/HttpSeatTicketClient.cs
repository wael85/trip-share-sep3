using System.Net.Http.Headers;
using System.Net.Http.Json;
using System.Text.Json;
using Domain.DTOs;
using Domain.Model;
using HttpClient.ClientInterfaces;

namespace HttpClient.ClientImplementation;

public class HttpSeatTicketClient:ISeatTicketClient
{
    private readonly System.Net.Http.HttpClient client;

    public HttpSeatTicketClient(System.Net.Http.HttpClient client)
    {
        this.client = client;
    }

    public async Task<IEnumerable<SeatTicket>> GetTicketsByUserIdAsync(string id)
    {
        client.DefaultRequestHeaders.Authorization = new AuthenticationHeaderValue("Bearer",JwtAuthService.Jwt);

        var response = await client.GetAsync($"/seatTickets/{id}");
        var result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }
        var reply =  JsonSerializer.Deserialize<IEnumerable<SeatTicket>>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;
        return reply;
    }

    public async Task CancelTicketAsync(long id)
    {
        client.DefaultRequestHeaders.Authorization = new AuthenticationHeaderValue("Bearer",JwtAuthService.Jwt);

        HttpResponseMessage response =await client.DeleteAsync($"/seatTickets/{id}");
        if (!response.IsSuccessStatusCode)
        {
            string content = await response.Content.ReadAsStringAsync();
            throw new Exception(content);
            
        }
    }

    public async Task<SeatTicket> ReserveTicketAsync(CreateSeatTicketDto seatTicketDto)
    {
        client.DefaultRequestHeaders.Authorization = new AuthenticationHeaderValue("Bearer",JwtAuthService.Jwt);

        var response = await client.PostAsJsonAsync($"/seatTickets", seatTicketDto);
        string content = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            
            throw new Exception(content);
            
        }
        SeatTicket seatTicket =JsonSerializer.Deserialize<SeatTicket>(content,new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;
        return seatTicket;
    }
}