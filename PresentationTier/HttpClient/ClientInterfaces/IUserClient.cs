using Domain.DTOs;
using Domain.Model;

namespace HttpClient.ClientInterfaces;

public interface IUserClient
{
    Task<ReturnedUserDTO> CreateAsync(User user);
    Task<ReturnedUserDTO> GetByIdAsync(string id);
}