using Domain.DTOs;
using Domain.Model;

namespace HttpClient.ClientImplementation;

public interface ICarClient
{
    Task<Car> CreateAsync(BeADriverRequestDto dto);
    Task<Car> Verify(string plateNumber);
}