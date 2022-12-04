using System.Globalization;
using Application.GrpcInterfaces;
using Domain.DTOs;
using Domain.Model;
using gRPCClient.GrpcInterfaces;

namespace gRPCClient.gRPC_Imp;

public class TripGrpcImp : ITripServices
{
    private readonly TripServices.TripServicesClient client;
    private readonly IUserService UserService;

    public TripGrpcImp(TripServices.TripServicesClient client, IUserService UserService)
    {
        this.client = client;
        this.UserService = UserService;
    }

    public async Task<Trip> CreateAsync(TripCreationDto dto)
    {
        List<TripCreationRequest.Types.Location> createlocations = new List<TripCreationRequest.Types.Location>(); 
        dto.Stops.ForEach(x =>
        {
            TripCreationRequest.Types.Location l = new TripCreationRequest.Types.Location()
            {
                ArrivalTime = x.ArrivalTime.ToString(new DateTimeFormatInfo().RFC1123Pattern),
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
                ArrivalTime = DateTime.Parse(x.ArrivalTime),
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

    public Task<ICollection<Trip>> GetTripByDriverIds(string driverEmail)
    {
        ICollection<Trip> trips = new List<Trip>();
        TripsByDriverIDRequest request = new TripsByDriverIDRequest()
        {
            UserId = driverEmail
        };

        var response = client.getTripsByUserID(request);
        var tripresponse = response.Trips;
        ;
        foreach (TripResponse var in tripresponse)
        {
            Trip trip = new Trip();
            ReturnedUserDTO driver = new ReturnedUserDTO()
            {
                Email = var.DriverId
            };
            trip.Driver = driver;
            var.Id = trip.Id;
            var.AvailableSeats = trip.AvailableSeats;
            var.FullPrice = trip.FullPrice;
            trip.Stops = new List<Location>();
            
            SeatTicket tic = new SeatTicket();
            foreach (var stop in var.Stops)
            {
                Location location = new Location();

                location.City = stop.City;
                location.Id = stop.Id;
                location.ArrivalTime = DateTime.Parse(stop.ArrivalTime);
                location.PostCode = stop.PostCode;
                location.StreetName = stop.StreetName;
                location.StreetNumber = stop.StreetNumber;
                trip.Stops.Add(location);
            }

            foreach (var ticket in var.Tickets)
            {
                tic.Id = ticket.Id;
                tic.Passenger.Email = ticket.PassengerId;
                tic.DropLocation.Id = ticket.DropoffId;
                tic.SeatAmount = ticket.TotalSeats;
                tic.SeatPrice = ticket.SeatPrice;
                tic.PickUpLocation.Id = ticket.PickupId;
                trip.Tickets.Add(tic);
            }



            trips.Add(trip);
        }
        Console.WriteLine(trips.FirstOrDefault().Driver.Email);

        return Task.FromResult<ICollection<Trip>>(trips);
    }

    public async Task<List<Trip>> GetAllTripsAsync()
    {
        var msg = new Emptymessage();
        var response = await client.getAllTripsAsync(msg);

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
                    ArrivalTime = DateTime.Parse(stop.ArrivalTime),
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