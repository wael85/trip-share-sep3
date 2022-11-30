
using System.Collections.ObjectModel;
using Application.GrpcInterfaces;
using Domain.DTOs;
using Domain.Model;
using Google.Protobuf.Collections;
using Google.Protobuf.Reflection;
using gRPCClient.GrpcInterfaces;
using Microsoft.VisualBasic;

namespace gRPCClient.gRPC_Imp;

public class TripGrpcImp : ITripServices
{
    private readonly TripServices.TripServicesClient client;
    private readonly IUserService UserService;

    public TripGrpcImp(TripServices.TripServicesClient client)
    {
        this.client = client;
    }

    public async Task<Trip> CreateAsync(TripCreationDto dto)
    {
        List<TripCreationRequest.Types.Location> createlocations = new List<TripCreationRequest.Types.Location>(); 
        dto.Stops.ForEach(x =>
        {
            TripCreationRequest.Types.Location l = new TripCreationRequest.Types.Location()
            {
                ArrivalTime =(long)(x.ArrivalTime - new DateTime(1970, 1, 1)).TotalMilliseconds,
                City = x.City,
                PostCode = x.PostCode,
                StreetName = x.StreetName,
                StreetNumber = x.StreetNumber
            };
            createlocations.Add(l);
        });

        TripCreationRequest request = new TripCreationRequest
        {
            DriverId = dto.DriverId,
            AvailableSeats = dto.AvailableSeats,
            FullPrice = dto.FullPrice,
            Stops = {createlocations}
            
        };
        

        TripResponse response = await client.createTripAsync(request);
        List<Location> resList = new List<Location>();
        foreach(var x in response.Stops)
        {
            Location l = new Location()
            {
                ArrivalTime = new DateTime(x.ArrivalTime),
                City = x.City,
                PostCode = x.PostCode,
                StreetName = x.StreetName,
                StreetNumber = x.StreetNumber
            };
            resList.Add(l);
        }
//Todo: Replace hardcoded obj with getUserByEmail or UserName
        ReturnedUserDTO d = new ReturnedUserDTO()
        {
            Address = "address",
            Email = "Email",
            FirstName = "Wael",
            LastName = "Haded"
        }; //await UserService.GetUserById(response.DriverId);

        Trip reTrip = new Trip();

        reTrip.Id = response.Id;
        reTrip.AvailableSeats = response.AvailableSeats;
        reTrip.Driver = d;
        reTrip.FullPrice = response.FullPrice;
        reTrip.Passengers = new List<ReturnedUserDTO>();
        reTrip.Stops = resList;
        reTrip.Tickets = new List<SeatTicket>();
        

        return await Task.FromResult(reTrip);
    }


    public Task<ICollection<Trip>> GetTripByDriverIds(List<string> driverIds)
    {
        throw new NotImplementedException();
    }
}