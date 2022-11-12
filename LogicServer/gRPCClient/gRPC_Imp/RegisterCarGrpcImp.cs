using Application.GrpcInterfaces;
using Domain.DTOs;
using Domain.Model;

namespace gRPCClient.gRPC_Imp;

public class RegisterCarGrpcImp:IRegisterCarService
{
    private readonly CarServices.CarServicesClient _client;
    
    public async Task<Car> RegisterAsync(string driverLicense ,Car car)
    {
        var request = new RequestCarInfo
        {
            Model = car.CarModel,
            Color = car.Color,
            PlateNumber = car.PlateNumber,
            SeatsCount = car.SeatsCount,
            FuelType = car.FuelType,
            DriverDriveLicense = driverLicense
        };
        var carInfo = _client.createCar(request);

        Car response = new Car(car.PlateNumber, carInfo.Color, carInfo.Model, car.SeatsCount, car.FuelType);

        return await Task.FromResult(response);
    }
}