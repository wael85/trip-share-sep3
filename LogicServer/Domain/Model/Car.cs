namespace Domain.Model;

public class Car
{
   
    public string PlateNumber { get; set; }
    public string Color { get; set; }
    public string CarModel { get; set; }
    public int SeatsCount { get; set; }
    public string FuelType { get; set; }

    public Car(string plateNumber, string color, string carModel, int seatsCount, string fuelType)
    {
        PlateNumber = plateNumber;
        Color = color;
        CarModel = carModel;
        SeatsCount = seatsCount;
        FuelType = fuelType;
    }
}