using Domain.DTOs;
using Domain.Model;

namespace Application.gRPCinterfaces;

public interface IUser
{
    Task<ReturnedUserDTO> CreatAsync(User user);
}