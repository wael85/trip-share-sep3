namespace Domain.Model;

public class Location
{
    public long Id { get; set; }
    public string PostCode { get; set; }
    public string City { get; set; }
    public string StreetName { get; set; }
    public string StreetNumber { get; set; }
    public DateTime ArrivalTime { get; set; }

    public Location(long id, string postCode, string city, string streetName, string streetNumber, DateTime arrivalTime)
    {
        Id = id;
        PostCode = postCode;
        City = city;
        StreetName = streetName;
        StreetNumber = streetNumber;
        ArrivalTime = arrivalTime;
    }
    public Location(){}
    

    public string getAddress()
    {
        return StreetName + " " + StreetNumber + ", " + PostCode + " " + City;
    }

    public bool getLocationByCity(string searchCity)
    {
        return this.City.Equals(searchCity);
    }
    
}