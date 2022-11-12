using Application.GrpcInterfaces;
using Application.LogicInterfaces;
using Domain.Model;

namespace Application.Logic;

public class RegisterCarLogic:IRegisterCarLogic
{
    private readonly IRegisterCarService _service;
    

    public RegisterCarLogic(IRegisterCarService service)
    {
        _service = service;
    }

    public async Task<Car> RegisterAsync(string driverLicense, Car car)
    {
        var response = await _service.RegisterAsync(driverLicense, car);
        
        return await Task.FromResult(response); 
    }
}