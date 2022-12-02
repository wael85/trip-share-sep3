using Domain.Model;

namespace Domain.DTOs;

public class TripSearchQuery
{
    
    public string? Pickup { get; set; }
    public string? Dropoff { get; set; }
    public int? PassengerAmount { get; set; }
    public double? MaxPrice { get; set; }
    public DateTime? TripDateTime { get; set; }
}