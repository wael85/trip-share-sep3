using Domain.DTOs;

namespace Domain.Model;

public class Trip
{
    public long Id { get; set; }
    public ReturnedUserDTO Driver { get; set; }
    public List<ReturnedUserDTO> Passengers { get; set; }
    public int AvailableSeats { get; set; }
    public List<SeatTicket> Tickets { get; set; }
    public List<Location> Stops { get; set; }
    public double FullPrice { get; set; }

    public void AddTicket(SeatTicket t)
    {
        // do something
    }
    public double SubTripPrice(string start , string end)
    {
        double startPrice = FullPrice * 0.2;
        double stepPrice = (FullPrice - startPrice) / (Stops.Count-1);
        int stepsCount =Math.Abs( Stops.IndexOf(Stops.Single(x=>x.getLocationByCity(end))) - Stops.IndexOf(Stops.Single(x=>x.getLocationByCity(start))));
        return startPrice + (stepsCount * stepPrice);

    }
    

}