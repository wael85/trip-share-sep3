namespace Domain.Model;

public class Notification
{
    public int Id { get; set; }
    public String Consumer { get; set; }
    public String Sender { get; set; }
    public Location  RequestedPickUpLocation{ get; set; }
    public Location RequestedDropUpLocation { get; set; }
    public int RequestedTripId { get; set; }
    public double SeatPrice { get; set; }
    public int  SeatCount { get; set; }
    public string Msg { get; set; }
    public bool Consumed { get; set; }
    
}