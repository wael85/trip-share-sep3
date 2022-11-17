namespace Domain.DTOs;

public class BeADriverRequestDto
{
    public string? DriveLicense { get; set; }
    public string PlateNumber { get; set; }
    public string Color { get; set; }
    public string CarModel { get; set; }
    public int SeatsCount { get; set; }
    public string FuelType { get; set; }

    public BeADriverRequestDto(string? driveLicense, string plateNumber, string color, string carModel, int seatsCount, string fuelType)
    {
        DriveLicense = driveLicense;
        PlateNumber = plateNumber;
        Color = color;
        CarModel = carModel;
        SeatsCount = seatsCount;
        FuelType = fuelType;
    }
}