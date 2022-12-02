using Domain.DTOs;
using Domain.Model;

namespace Application.GrpcInterfaces;

public interface ITripServices
{
    Task<Trip> CreateAsync(TripCreationDto dto);
    Task<ICollection<Trip>> GetTripByDriverIds(List<string> driverIds);
    Task<List<Trip>> GetAllTripsAsync();
}