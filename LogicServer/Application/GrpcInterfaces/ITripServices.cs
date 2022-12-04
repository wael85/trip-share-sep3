using Domain.DTOs;
using Domain.Model;

namespace Application.GrpcInterfaces;

public interface ITripServices
{
    Task<Trip> CreateAsync(TripCreationDto dto);
    Task<ICollection<Trip>> GetTripByDriverIds(string driverEmail);
    Task<List<Trip>> GetAllTripsAsync();
}