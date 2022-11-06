using Domain.DTOs;
using Domain.Model;
using gRPCClient.GrpcInterfaces;

namespace gRPCClient.gRPC_Imp;

public class UserGrpcImp : IUserService
{
    private readonly UserServices.UserServicesClient client;

    public UserGrpcImp(UserServices.UserServicesClient client)
    {
        this.client = client;
    }

    public async Task<ReturnedUserDTO> CreateAsync(User user)
    {
        
        RequestUserInfo requestedInfo = new RequestUserInfo
        {
            Email = user.Email,
            Password = user.Password,
            FirstName = user.FirstName,
            LastName = user.LastName,
            Phone = user.Phone,
            Address = user.Address,
            DriveLicense = user.DriveLicense
        };
        try
        {
            ResponseUserInfo replay = await client.createUserAsync(requestedInfo);
            var dto = new ReturnedUserDTO()
            {
                Email = replay.Email,
                FirstName = replay.FirstName,
                LastName = replay.LastName,
                Phone = replay.Phone,
                Address = replay.Address
            };
            return await Task.FromResult(dto);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            throw new Exception("some thing went wrong: " + e.Message);
        }

    }
}