
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

    public async Task<ReturnedUserDTO> ValidateUserAsync(UserLoginDto userLoginDto)
    {
        ReturnedUserDTO user = await service.ValidateUserAsync(userLoginDto);
        
        return user;
    }
}