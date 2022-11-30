using Domain.Model;

namespace Domain.DTOs;

public class TripCreationDto
{
    public string DriverId { get; set; }
    public double FullPrice { get; set; }
    public int AvailableSeats { get; set; }
    public List<Location> Stops { get; set; }

    public TripCreationDto(string driverId, double fullPrice, int availableSeats, List<Location> stops)
    {
        DriverId = driverId;
        FullPrice = fullPrice;
        AvailableSeats = availableSeats;
        Stops = stops;
    }

    public TripCreationDto()
    {
    }
}