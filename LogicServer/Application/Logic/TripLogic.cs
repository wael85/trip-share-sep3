using Application.GrpcInterfaces;
using Application.LogicInterfaces;
using Domain.DTOs;
using Domain.Model;
using gRPCClient.GrpcInterfaces;

namespace Application.Logic;

public class TripLogic : ITripLogic
{
    private readonly IUserService UserService;
    private readonly ITripServices TripServices;
    public async Task<Trip> CreateAsync(TripCreationDto trip)
    {
        Trip trip1 = new Trip();

        trip1.Stops = trip.Stops;
        trip1.Driver = await UserService.GetUserById(trip.DriverId);
        trip1.AvailableSeats = trip.AvailableSeats;
        trip1.FullPrice = trip.FullPrice;

        return await TripServices.CreateAsync(trip1);


    }
}