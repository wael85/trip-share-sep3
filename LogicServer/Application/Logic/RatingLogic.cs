using Application.GrpcInterfaces;
using Application.LogicInterfaces;
using Domain.DTOs;
using Domain.Model;

namespace Application.Logic;

public class RatingLogic : IRatingLogic
{
    private readonly IRatingService _service;

    public RatingLogic(IRatingService service)
    {
        _service = service;
    }
    
    public async Task<Rating> CreateAsync(RatingCreationDTO dto)
    {
        if (dto.Value > 5)
            dto.Value = 5;
        
        if (dto.Value < 0)
            dto.Value = 5;
        
        return await _service.CreateAsync(dto);
    }

    public async Task<Rating> GetAsync(long ratingId)
    {
        return await _service.GetAsync(ratingId);
    }

    public async Task<List<Rating>> GetAllAsync()
    {
        return await _service.GetAllAsync();
    }

    public async Task<List<Rating>> GetFromWriterAsync(string writerEmail)
    {
        return await _service.GetFromWriterAsync(writerEmail);
    }

    public async Task<List<Rating>> GetFromSubjectAsync(string subjectEmail)
    {
        return await _service.GetFromSubjectAsync(subjectEmail);
    }

    public async Task<RatingMeanDTO> GetMeanFromSubjectAsync(string subjectEmail)
    {
        var ratings = await _service.GetFromSubjectAsync(subjectEmail);
        
        var ratingsSum = ratings.Sum(rating => rating.Value);
        if (ratings.Count == 0)
        {
            return new RatingMeanDTO(ratingsSum /1, ratings.Count);
        }
            
        return new RatingMeanDTO(ratingsSum / ratings.Count, ratings.Count);
    }
}