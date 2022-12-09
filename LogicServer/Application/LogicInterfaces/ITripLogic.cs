using Domain.DTOs;
using Domain.Model;

namespace Application.LogicInterfaces;

public interface ITripLogic
{

    Task<Trip> CreateAsync(TripCreationDto dto);
    Task<List<Trip>> GetAllAsync();
    Task<List<Trip>> QueryAsync(string? pickup, string? dropoff, int passengerAmount, double? maxPrice, DateTime tripDateTime);
    Task<List<Trip>> GetUsersTripsByEmail(string email);
}