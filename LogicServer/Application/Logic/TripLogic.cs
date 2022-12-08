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

    public async Task<List<Trip>> GetAllAsync()
    {
        return await TripServices.GetAllTripsAsync();
    }

    public async Task<List<Trip>> QueryAsync(string? pickup, string? dropoff, int queryPassengerAmount, double? maxPrice, DateTime tripDateTime)
    {
        var trips = await TripServices.GetAllTripsAsync();
        var skipLocations = pickup == null || dropoff == null; // If either location query is none ignore both
        
        var trips2 = new List<Trip>();

        foreach (var trip in trips)
        {
            if (trip.Stops.Count < 1)
                continue;
            
            Location? validPickup = null;
            Location? validDropoff = null;

            foreach (var stop in trip.Stops)
            {
                if (!skipLocations)
                {
                    if (QueryLocations(stop, pickup) &&
                        stop.ArrivalTime.CompareTo(tripDateTime) >= 0)
                    {
                        validPickup = stop;
                    }
                
                    if (QueryLocations(stop, dropoff) && validPickup != null)
                    {
                        validDropoff ??= stop;
                    }
                }

                if (validPickup == null) 
                    continue;
                
                var currentPassengerAmount = trip.Tickets
                    .Where(ticket => ticket.PickUpLocation == stop)
                    .Sum(ticket => ticket.SeatAmount);

                if (currentPassengerAmount + queryPassengerAmount <= trip.AvailableSeats) 
                    continue;
                
                validPickup = null;
                validDropoff = null;
            }
            
            if ((validPickup == null || validDropoff == null) && !skipLocations) 
                continue;

            if (skipLocations && maxPrice < trip.FullPrice)
                continue;
            
            if (queryPassengerAmount > trip.AvailableSeats)
                continue;
            
            if (maxPrice >= trip.SubTripPrice(validPickup!.City, validDropoff!.City) || maxPrice == null)
            {
                trips2.Add(trip);
            }
        }

        return trips2;
    }

    public async Task<List<Trip>> GetUsersTripsByEmail(string email)
    {
        return await TripServices.GetTripsByDriverId(email);
    }

    private static bool QueryLocations(Location original, string query)
    {
        return (query == "" || query.ToLower() == original.City.ToLower());
    }
}