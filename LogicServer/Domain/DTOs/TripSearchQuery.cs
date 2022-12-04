using Domain.Model;

namespace Domain.DTOs;

public class TripSearchQuery
{
    public string Pickup { get; set; }
    public string Dropoff { get; set; }
    public int PassengerAmount { get; set; }
    public double MaxPrice { get; set; }
    public DateTime TripDateTime { get; set; }

    public TripSearchQuery Clone()
    {
        return new TripSearchQuery()
        {
            Pickup = this.Pickup,
            Dropoff = this.Dropoff,
            PassengerAmount = this.PassengerAmount,
            MaxPrice = this.MaxPrice,
            TripDateTime = this.TripDateTime
        };
    }

    public static TripSearchQuery NewDefault()
    {
        return new TripSearchQuery()
        {
            Pickup = "",
            Dropoff = "",
            PassengerAmount = 1,
            
        };
    }
}