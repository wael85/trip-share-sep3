using Domain.DTOs;
using Domain.Model;

namespace HttpClient.ClientInterfaces;

public interface ITripClient
{
     Task<Trip> CreateTripAsync(TripCreationDto dto);
     Task<List<Trip>> GetAllTripAsync();
     Task<List<Trip>> GetTripsByUserIdAsync(string id);
     Task<List<Trip>> GetTripsAsync(TripSearchQuery searchQuery);
}