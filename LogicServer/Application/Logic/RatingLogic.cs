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
}