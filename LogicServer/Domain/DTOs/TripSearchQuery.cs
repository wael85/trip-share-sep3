using Domain.Model;

namespace Domain.DTOs;

public class TripSearchQuery
{
    public TripSearchQuery(Location pickup, Location dropoff, int passengerAmount, double maxPrice)
    {
        Pickup = pickup;
        Dropoff = dropoff;
        PassengerAmount = passengerAmount;
        MaxPrice = maxPrice;
    }

    public TripSearchQuery()
    {
        
    }

    public Location Pickup { get; set; }
    public Location Dropoff { get; set; }
    public int PassengerAmount { get; set; }
    public double MaxPrice { get; set; }
}