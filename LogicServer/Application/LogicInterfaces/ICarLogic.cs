using Domain.DTOs;
using Domain.Model;

namespace Application.LogicInterfaces;

public interface ICarLogic
{
    Task<Car> RegisterAsync(BeADriverRequestDto dto);

    Task<Car?> VerifyCar(string plateNumber);
}