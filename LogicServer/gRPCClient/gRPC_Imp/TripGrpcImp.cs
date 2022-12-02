using Application.GrpcInterfaces;
using Domain.DTOs;
using Domain.Model;
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

        ReturnedUserDTO d = await UserService.GetUserById(response.DriverId);
    

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

    public async Task<List<Trip>> GetAllTripsAsync()
    {
        var msg = new Emptymessage();
        TripsByDriverIDResponse response = await client.getAllTripsAsync(msg);

        var tripResponses = response.Trips;
        var trips = new List<Trip>();

        foreach (var tripResponse in tripResponses)
        {
            var driver = await UserService.GetUserById(tripResponse.DriverId);

            var trip = new Trip()
            {
                AvailableSeats = tripResponse.AvailableSeats,
                Driver = new ReturnedUserDTO()
                {
                    Address = driver.Address,
                    DriveLicense = driver.DriveLicense,
                    Email = driver.Email,
                    FirstName = driver.FirstName,
                    LastName = driver.LastName,
                    Phone = driver.Phone
                },
                FullPrice = tripResponse.FullPrice,
                Id = tripResponse.Id,
                Passengers = new List<ReturnedUserDTO>()
            };

            var stops = tripResponse.Stops.Select(stop => new Location()
                {
                    Id = stop.Id,
                    ArrivalTime = new DateTime(stop.ArrivalTime),
                    City = stop.City,
                    PostCode = stop.PostCode,
                    StreetName = stop.StreetName,
                    StreetNumber = stop.StreetNumber
                })
                .ToList();
            trip.Stops = stops;

            //TODO: Not be lazy (:
            var tickets = new List<SeatTicket>();
            trip.Tickets = tickets;
            
            trips.Add(trip);
        }

        return trips;
    }
}