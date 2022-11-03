using Domain.DTOs;
using Domain.Model;

namespace HttpClient.ClientImplementation;

public interface IUserClient
{
    Task<ReturnedUserDTO> CreateAsync(User user);
}