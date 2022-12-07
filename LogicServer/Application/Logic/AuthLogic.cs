
using Application.LogicInterface;
using Domain.DTOs;
using Domain.Model;
using gRPCClient.GrpcInterfaces;


namespace Application.Logic;

public class AuthLogic:IAuthLogic
{
    
    private readonly IUserService service;

    public AuthLogic(IUserService service)
    {
        this.service = service;
    }

    public async Task<User> ValidateUserAsync(UserLoginDto userLoginDto)
    {
        User? check = await service.ValidateUserAsync(userLoginDto);
        if (check==null)
        {
            throw new Exception("User not found");
        }

        if (!check.Password.Equals(userLoginDto.Password))
        {
            throw new Exception("Password not correct");
        }

        return check;
    }
}