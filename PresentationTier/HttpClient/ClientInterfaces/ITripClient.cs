using Domain.Model;

namespace HttpClient.ClientImplementation;

public interface ITripClient
{
     Task<Trip> CreateTripAsync(Trip trip);
     Task<IEnumerable<Trip>> GetAllTripAsync();
}