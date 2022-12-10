using Domain.DTOs;
using Domain.Model;

namespace Application.LogicInterfaces;

public interface IRatingLogic
{
    public Task<Rating> CreateAsync(RatingCreationDTO dto);
    public Task<Rating> GetAsync(long ratingId);
    public Task<List<Rating>> GetAllAsync();
    public Task<List<Rating>> GetFromWriterAsync(string writerEmail);
    public Task<List<Rating>> GetFromSubjectAsync(string subjectEmail);
    public Task<RatingMeanDTO> GetMeanFromSubjectAsync(string subjectEmail);
}