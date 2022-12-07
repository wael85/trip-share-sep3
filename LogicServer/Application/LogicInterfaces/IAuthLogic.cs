

using Domain.DTOs;
using Domain.Model;

namespace Application.LogicInterface;

public interface IAuthLogic
{
    Task<User> ValidateUserAsync(UserLoginDto userLoginDto);
}