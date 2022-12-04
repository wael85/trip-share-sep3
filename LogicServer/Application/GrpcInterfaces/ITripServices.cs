using Domain.DTOs;
using Domain.Model;

namespace Application.GrpcInterfaces;

public interface ITripServices
{
    Task<Trip> CreateAsync(TripCreationDto dto);
    Task<IEnumerable<Trip>> GetTripsByDriverId(List<string> driverId);
    Task<List<Trip>> GetAllTripsAsync();
}