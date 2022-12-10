using Domain.DTOs;
using Domain.Model;

namespace Application.GrpcInterfaces;

public interface ICarService
{
    Task<Car> RegisterAsync(BeADriverRequestDto dto);
    Task<Car> GetByDriverIdAsync(string email);
}