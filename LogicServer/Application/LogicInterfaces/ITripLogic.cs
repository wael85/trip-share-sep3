using Domain.DTOs;
using Domain.Model;

namespace Application.LogicInterfaces;

public interface ITripLogic
{

    Task<Trip> CreateAsync(TripCreationDto trip);
}