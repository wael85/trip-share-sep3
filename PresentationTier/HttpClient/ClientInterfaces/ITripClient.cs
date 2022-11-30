using Domain.DTOs;
using Domain.Model;

namespace HttpClient.ClientInterfaces;

public interface ITripClient
{
     Task<Trip> CreateTripAsync(TripCreationDto dto);
     Task<IEnumerable<Trip>> GetAllTripAsync();
     Task<IEnumerable<Trip>> GetTripsByUserIdAsync(string id);
}