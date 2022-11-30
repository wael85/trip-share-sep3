using Domain.DTOs;
using Domain.Model;

namespace HttpClient.ClientImplementation;

public interface ITripClient
{
     Task<Trip> CreateTripAsync(TripCreationDto dto);
     Task<IEnumerable<Trip>> GetAllTripAsync();
}