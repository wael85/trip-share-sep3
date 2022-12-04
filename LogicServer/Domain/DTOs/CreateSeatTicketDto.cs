namespace Domain.DTOs;

public class CreateSeatTicketDto
{
    public double SeatPrice { get; set; }
    public int SeatAmount { get; set; }
    public string PassengerId { get; set; }
    public long TripId { get; set; }
    public long PickUpLocationId { get; set; }
    public long DropLocationId { get; set; }
}