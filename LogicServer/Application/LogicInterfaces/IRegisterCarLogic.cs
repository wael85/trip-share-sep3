using Domain.Model;

namespace Application.LogicInterfaces;

public interface IRegisterCarLogic
{
    Task<Car> RegisterAsync(string driverLicense,Car car);
}