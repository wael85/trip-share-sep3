namespace Domain.DTOs;

public class BeADriverRequestDto
{
    public string? DriveLicense { get; set; }
    public string PlateNumber { get; set; }
    public string Color { get; set; }
    public string CarModel { get; set; }
    public int SeatsCount { get; set; }
    public string FuelType { get; set; }
}