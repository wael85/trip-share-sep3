namespace Domain.Model;

public class Location
{
    public long Id { get; set; }
    public string PostCode { get; set; }
    public string City { get; set; }
    public string StreetName { get; set; }
    public string StreetNumber { get; set; }
    public DateTime ArrivalTime { get; set; }
    
}