using Domain.DTOs;
using Domain.Model;
using gRPCClient.grpcInterfaces;
using gRPCClient.Proto;

namespace gRPCClient.gRPC_Imp;

public class UserGrpcImp:IUserGrpc
{
    private readonly UserService.UserServiceClient userClient;


    public async Task<ReturnedUserDTO> CreateAsync(User user)
    {

        var create = await userClient.CreateUserAsync(new RequestUserInfo
         {
             Email = user.Email,
             Password = user.Password,
             FirstName = user.FirstName,
             LastName = user.LastName,
             Phone = user.Phone,
             Address = user.Address,
             DriveLicense = user.DriveLicense
         });
        
        var dto = new ReturnedUserDTO
        {
            Email = create.Email,
            FirstName = create.FirstName,
            LastName = create.LastName,
            Phone = create.Phone,
            Address = create.Address
        };
        return await Task.FromResult(dto);

    }
}