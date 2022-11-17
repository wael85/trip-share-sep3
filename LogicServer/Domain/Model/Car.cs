
using System.Net;
using System.Text.Json;
using System.Text.Json.Serialization;

namespace Domain.Model;

public class Car
{
    [JsonPropertyName("registration_number")]
    public string PlateNumber { get; set; }
    [JsonPropertyName("color")]
    public string Color { get; set; }
    [JsonPropertyName("model")]
    public string CarModel { get; set; }
    [JsonPropertyName("seats")]
    public int? SeatsCount { get; set; }
    [JsonPropertyName("fuel_type")]
    public string FuelType { get; set; }


    public Car( string plateNumber, string color, string carModel, int? seatsCount, string fuelType)
    {
        PlateNumber = plateNumber;
        Color = color;
        CarModel = carModel;
        SeatsCount = seatsCount;
        FuelType = fuelType;
    }
    
}
    