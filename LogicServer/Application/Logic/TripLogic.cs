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

    public TripLogic(IUserService userService, ITripServices tripServices)
    {
        UserService = userService;
        TripServices = tripServices;
    }

    public async Task<Trip> CreateAsync(TripCreationDto dto)
    {
        return await TripServices.CreateAsync(dto);
        
    }

    public async Task<List<Trip>> QueryAsync(Location pickup, Location dropoff, int passengerAmount, double maxPrice)
    {
        var trips = await TripServices.GetAllTripsAsync();

        foreach (var trip in trips)
        {
            var hasPickup = false;
            var hasDropoff = false;

            Location cPickup = new Location();
            Location cStop = new Location();

            foreach (var stop in trip.Stops)
            {
                if (QueryLocations(stop, pickup) &&
                    stop.ArrivalTime.CompareTo(pickup.ArrivalTime) >= 0)
                {
                    cPickup = stop;
                    hasPickup = true;
                }
                
                if (QueryLocations(stop, dropoff) && hasPickup &&
                    stop.ArrivalTime.CompareTo(dropoff.ArrivalTime) <= 0)
                {
                    if (!hasDropoff)
                        cStop = stop;
                    
                    hasDropoff = true;
                }

                if (!hasPickup) continue;
                var currentPassengerAmount = trip.Tickets
                    .Where(ticket => ticket.PickUpLocation == stop)
                    .Sum(ticket => ticket.SeatAmount);

                if (currentPassengerAmount + passengerAmount > trip.AvailableSeats)
                {
                    hasPickup = false;
                }
            }

            if (!(hasPickup && hasDropoff))
                trips.Remove(trip);
            else if (hasDropoff && hasPickup && maxPrice < trip.SubTripPrice(cPickup, cStop))
                trips.Remove(trip);
        }

        return trips;
    }

    private static bool QueryLocations(Location original, Location query)
    {
        return (query.StreetNumber == "!EMPTY!" || query.StreetNumber == original.StreetNumber) &&
               (query.StreetName == "!EMPTY!" || query.StreetName == original.StreetName) &&
               (query.StreetName == "!EMPTY!" || query.City == original.City) &&
               (query.PostCode == "!EMPTY!" || query.PostCode == original.PostCode);
    }
}