using Domain.DTOs;
using Domain.Model;

namespace Application.LogicInterfaces;

public interface ITripLogic
{

    Task<Trip> CreateAsync(TripCreationDto dto);
    Task<List<Trip>> QueryAsync(Location pickup, Location dropoff, int passengerAmount, double maxPrice);
}