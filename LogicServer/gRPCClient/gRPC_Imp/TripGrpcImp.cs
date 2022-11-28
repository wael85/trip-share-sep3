
using Application.GrpcInterfaces;
using Domain.DTOs;
using Domain.Model;
using Google.Protobuf.Reflection;
using gRPCClient.GrpcInterfaces;

namespace gRPCClient.gRPC_Imp;

public class TripGrpcImp : ITripServices
{
    private readonly TripServices.TripServicesClient client;
    private readonly IUserService UserService;

    public TripGrpcImp(TripServices.TripServicesClient client)
    {
        this.client = client;
    }

    public async Task<Trip> CreateAsync(Trip trip)
    {


        TripCreationRequest request = new TripCreationRequest
        {
            DriverId = trip.Driver.Email,
            AvailableSeats = trip.AvailableSeats,
            FullPrice = trip.AvailableSeats,
            
        };
        foreach (var stop in trip.Stops)
        {
            foreach (var rstop in request.Stops)
            {
                rstop.City = stop.City;
                rstop.ArrivalTime = stop.ArrivalTime.Ticks;
                rstop.PostCode = stop.PostCode;
                rstop.StreetName = stop.StreetName;
                rstop.StreetNumber = stop.StreetNumber; 
            };

        }
            
    
    

        TripResponse response = await client.createTripAsync(request);

        Trip returend = new Trip
        {
            AvailableSeats = response.AvailableSeats,
            Passengers = new List<ReturnedUserDTO>(),
            Driver = await UserService.GetUserById(response.DriverId),                   
            Tickets = new List<SeatTicket>(),
        };
        
        List<Location> locations = new List<Location>();
        foreach (var stop in response.Stops)
        {
            Location location = new Location(
                stop.Id,
                stop.PostCode,
                stop.City,
                stop.StreetName,
                stop.StreetNumber,
                new DateTime(stop.ArrivalTime));
            
            
            locations.Add(location);

        }

        returend.Stops = locations;

        return returend;
    }


    public Task<ICollection<Trip>> GetTripByDriverIds(List<string> driverIds)
    {
        throw new NotImplementedException();
    }
}