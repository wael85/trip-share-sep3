using Domain.DTOs;
using Domain.Model;

namespace gRPCClient.grpcInterfaces;

public interface IUserGrpc
{
    Task<ReturnedUserDTO> CreateAsync(User user);
}