using Domain.DTOs;
using Domain.Model;

namespace Application.GrpcInterfaces;

public interface IRegisterCarService
{
    Task<Car> RegisterAsync(string driverLicense,Car car);
}