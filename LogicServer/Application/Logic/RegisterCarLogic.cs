using Application.GrpcInterfaces;
using Application.LogicInterfaces;
using Domain.DTOs;
using Domain.Model;

namespace Application.Logic;

public class RegisterCarLogic:IRegisterCarLogic
{
    private readonly IRegisterCarService _service;
    

    public RegisterCarLogic(IRegisterCarService service)
    {
        _service = service;
    }

    public async Task<Car> RegisterAsync(BeADriverRequestDto dto)
    {
        var response = await _service.RegisterAsync(dto);

        return response;
    }

    public async Task<Car?> VerifyCar(string plateNumber)
    {
        try
        {
            Console.WriteLine(plateNumber);
            Car? car = new Car(plateNumber);
            return await Task.FromResult(car);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            throw;
        }
    }
}