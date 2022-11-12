using Domain.DTOs;
using Domain.Model;

namespace Application.LogicInterfaces;

public interface IRegisterCarLogic
{
    Task<Car> RegisterAsync(BeADriverRequestDto dto);
}