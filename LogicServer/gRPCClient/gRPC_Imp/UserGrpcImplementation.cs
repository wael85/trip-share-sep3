using Domain.DTOs;
using Domain.Model;
using gRPCClient.GrpcInterfaces;

namespace gRPCClient.gRPC_Imp;

public class UserGrpcImplementation:IUserService
{

    public Task<ReturnedUserDTO> CreateAsync(User user)
    {
        throw new NotImplementedException();
    }
}