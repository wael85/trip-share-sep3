namespace Domain.Model;

public class SeatTicket
{
    public long Id { get; set; } 
    public double SeatPrice { get; set; }
    public int SeatAmount { get; set; } 
    public User Passenger { get; set; }
  
    public long TripId { get; set; }
    public Location PickUpLocation { get; set; }
    public Location DropLocation { get; set; }

    public double TicketPrice()
    {
        return SeatPrice * SeatAmount;
    }
    
}