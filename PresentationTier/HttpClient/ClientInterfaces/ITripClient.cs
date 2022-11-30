using Domain.Model;

namespace HttpClient.ClientInterfaces;

public interface ITripClient
{
     Task<Trip> CreateTripAsync(Trip trip);
     Task<IEnumerable<Trip>> GetAllTripAsync();
     Task<IEnumerable<Trip>> GetTripsByUserIdAsync(string id);
}