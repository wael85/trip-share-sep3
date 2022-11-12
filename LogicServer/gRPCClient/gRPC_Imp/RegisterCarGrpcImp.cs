using Application.GrpcInterfaces;
using Domain.DTOs;
using Domain.Model;

namespace gRPCClient.gRPC_Imp;

public class RegisterCarGrpcImp:IRegisterCarService
{
    private readonly CarServices.CarServicesClient _client;

    public RegisterCarGrpcImp(CarServices.CarServicesClient client)
    {
        _client = client;
    }

    public async Task<Car> RegisterAsync(BeADriverRequestDto dto)
    {
        var request = new RequestCarInfo
        {
            Model = dto.CarModel,
            Color = dto.Color,
            PlateNumber = dto.PlateNumber,
            SeatsCount = dto.SeatsCount,
            FuelType = dto.FuelType,
            DriverDriveLicense = dto.DriveLicense
        };
        var carInfo = await _client.createCarAsync(request);
        

        Car response = new Car(carInfo.PlateNumber, carInfo.Color, carInfo.Model, carInfo.SeatsCount, carInfo.FuelType);

        return response;
    }
}