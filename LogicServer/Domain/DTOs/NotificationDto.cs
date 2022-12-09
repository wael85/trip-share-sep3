namespace Domain.DTOs;

public class NotificationDto
{
    public int Id { get; set; }
    public String Consumer { get; set; }
    public String Sender { get; set; }
    public int  RequestedPickUpLocation{ get; set; }
    public int RequestedDropUpLocation { get; set; }
    public int RequestedTripId { get; set; }
    public double SeatPrice { get; set; }
    public int  SeatCount { get; set; }
    public string Msg { get; set; }
    public bool Consumed { get; set; }
}