using Domain.DTOs;
using Domain.Model;

namespace HttpClient.ClientInterfaces;

public interface IRatingClient
{
    Task<List<Rating>> GetRatingsBySubject(string subjectEmail);
    Task<Rating> CreateRating(RatingCreationDTO dto);
    Task<RatingMeanDTO> GetRatingMeanBySubject(string subjectEmail);
}