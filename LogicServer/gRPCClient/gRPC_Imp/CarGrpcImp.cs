using Application.GrpcInterfaces;
using Domain.DTOs;
using Domain.Model;
using Grpc.Core;

namespace gRPCClient.gRPC_Imp;

public class CarGrpcImp : ICarService
{
    private readonly CarServices.CarServicesClient _client;

    public CarGrpcImp(CarServices.CarServicesClient client)
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
            DriverId = dto.DriverId,
            DriveLicense = dto.DriveLicense
        };

        try
        {
            var carInfo = await _client.createCarAsync(request);
            Car response = new Car(carInfo.PlateNumber, carInfo.Color, carInfo.Model, carInfo.SeatsCount,
                carInfo.FuelType);
            return response;
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            throw new Exception(e.Message);
        }
    }

    public async Task<Car> GetByDriverIdAsync(string email)
    {
        var request = new DriverIdInfo()
        {
            DriverId = email
        };
        try
        {
            var carInfo = await _client.getCarByDriverIdAsync(request);
            Car response = new Car(carInfo.PlateNumber, carInfo.Color, carInfo.Model, carInfo.SeatsCount,
                carInfo.FuelType);
            return response;
        }
        catch (Exception e)
        {
            Console.WriteLine(e.Message);
            throw new Exception(e.Message);
        }
    }
}