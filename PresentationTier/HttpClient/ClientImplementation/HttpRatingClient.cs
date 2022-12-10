using System.Net.Http.Json;
using System.Text.Json;
using Domain.DTOs;
using Domain.Model;
using HttpClient.ClientInterfaces;

namespace HttpClient.ClientImplementation;

public class HttpRatingClient : IRatingClient
{
    private readonly System.Net.Http.HttpClient _client;

    public HttpRatingClient(System.Net.Http.HttpClient client)
    {
        _client = client;
    }

    public async Task<List<Rating>> GetRatingsBySubject(string subjectEmail)
    {
        var response = await _client.GetAsync(
            $"/Ratings?subjectEmail={subjectEmail}");
        string result = await response.Content.ReadAsStringAsync();
        if (response.IsSuccessStatusCode)
        {
            var ratings = JsonSerializer.Deserialize<List<Rating>>(result,new JsonSerializerOptions
            {
                PropertyNameCaseInsensitive = true
            })!;
            return ratings;
        }
        throw new Exception(result);
    }
    
    public async Task<List<Rating>> GetRatingsByWriter(string writerEmail)
    {
        var response = await _client.GetAsync(
            $"/Ratings?writerEmail={writerEmail}");
        string result = await response.Content.ReadAsStringAsync();
        if (response.IsSuccessStatusCode)
        {
            var ratings = JsonSerializer.Deserialize<List<Rating>>(result,new JsonSerializerOptions
            {
                PropertyNameCaseInsensitive = true
            })!;
            return ratings;
        }
        throw new Exception(result);
    }

    public async Task<Rating> CreateRating(RatingCreationDTO dto)
    {
        var response = await _client.PostAsJsonAsync("/Ratings", dto);
        var result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }

        var rating = JsonSerializer.Deserialize<Rating>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        });
        return rating;
    }

    public async Task<RatingMeanDTO> GetRatingMeanBySubject(string subjectEmail)
    {
        var response = await _client.GetAsync(
            $"/Ratings/Mean?subjectEmail={subjectEmail}");
        string result = await response.Content.ReadAsStringAsync();
        
        if (!response.IsSuccessStatusCode) 
            throw new Exception(result);
        
        var rating = JsonSerializer.Deserialize<RatingMeanDTO>(result,new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;

        Console.Out.WriteLine($"{rating.Rating}");
        
        return rating;
    }
}