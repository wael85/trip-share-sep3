using Domain.Model;

namespace Application.LogicInterfaces;

public interface ITripLogic
{

    Task<Trip> CreateAsync(Trip trip);
}