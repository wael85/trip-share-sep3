using Domain.DTOs;
using Domain.Model;

namespace gRPCClient.GrpcInterfaces;

public interface IUserService
{
    Task<ReturnedUserDTO> CreateAsync(User user);
    Task<ReturnedUserDTO> GetUserById(string email);
    Task<ReturnedUserDTO> ValidateUserAsync(UserLoginDto userLoginDto);
}