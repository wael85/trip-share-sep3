

using Domain.DTOs;

namespace Application.LogicInterface;

public interface IAuthLogic
{
    Task<ReturnedUserDTO> ValidateUserAsync(UserLoginDto userLoginDto);
}