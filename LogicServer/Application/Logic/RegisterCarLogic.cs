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
}