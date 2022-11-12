namespace Domain.Model;

public class Car
{
    public int Id { get; set; }
    public string PlateNumber { get; set; }
    public string Color { get; set; }
    public string CarModel { get; set; }
    public int SeatsCount { get; set; }
    public string FuelType { get; set; }

    public Car(int id, string plateNumber, string color, string carModel, int seatsCount, string fuelType)
    {
        Id = id;
        PlateNumber = plateNumber;
        Color = color;
        CarModel = carModel;
        SeatsCount = seatsCount;
        FuelType = fuelType;
    }
}