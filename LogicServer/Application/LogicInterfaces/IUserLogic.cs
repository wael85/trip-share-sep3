using Domain.DTOs;
using Domain.Model;

namespace Application.LogicInterfaces;

public interface IUserLogic
{
    Task<ReturnedUserDTO> CreateAsync(User user);
    Task<UserInformationDto> GetUserInformationAsync(string email);
}