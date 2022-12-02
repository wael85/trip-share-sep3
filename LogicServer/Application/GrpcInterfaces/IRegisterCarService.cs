using Domain.DTOs;
using Domain.Model;

namespace Application.GrpcInterfaces;

public interface IRegisterCarService
{
    Task<Car> RegisterAsync(BeADriverRequestDto dto);
    Task<Car> GetByDriverIdAsync(string email);
}