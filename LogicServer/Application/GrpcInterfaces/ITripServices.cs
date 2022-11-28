using Domain.Model;

namespace Application.GrpcInterfaces;

public interface ITripServices
{
    Task<Trip> CreateAsync(Trip trip);
    Task<ICollection<Trip>> GetTripByDriverIds(List<string> driverIds);
}