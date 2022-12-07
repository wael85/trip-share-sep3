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
            Address = user.Address
        };
        
        if (user.DriveLicense != null)
        {
            requestedInfo.DriveLicense = user.DriveLicense;
        }
       
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

    public async Task<ReturnedUserDTO> GetUserById(string email)
    {

        GetUserRequest request = new GetUserRequest
        {
            Email = email
        };
        
        ResponseUserInfo response = await client.GetUserByIdAsync(request);
        
        return new ReturnedUserDTO
        {
            Address = response.Address,
            Email = response.Email,
            FirstName = response.FirstName,
            LastName = response.LastName,
            Phone = response.Phone,
            DriveLicense = response.DriverLicense
        };

    }

    public async Task<ReturnedUserDTO> ValidateUserAsync(UserLoginDto userLoginDto)
    {
        LoginUserMessage request = new LoginUserMessage
        {
            Email = userLoginDto.Username,
            Password = userLoginDto.Password
        };

        ResponseUserInfo replay = await client.LoginUserAsync(request);
        ReturnedUserDTO user = new ReturnedUserDTO
        {
            Email = replay.Email,
            FirstName = replay.FirstName,
            LastName = replay.LastName,
            Phone = replay.Phone,
            Address = replay.Address,
            DriveLicense = replay.DriverLicense
        };
        return user;
    }
    
}