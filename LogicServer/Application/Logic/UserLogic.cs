using System.Text.RegularExpressions;
using Application.GrpcInterfaces;
using Application.LogicInterfaces;
using Domain.DTOs;
using Domain.Model;
using gRPCClient.GrpcInterfaces;

namespace Application.Logic;

public class UserLogic : IUserLogic
{
    private readonly IUserService service;
    private readonly ICarService _carService;

    public UserLogic(IUserService service, ICarService carLogic)
    {
        this.service = service;
        _carService = carLogic;
    }

    public async Task<ReturnedUserDTO> CreateAsync(User user)
    {
        ValidateUSer(user);

        ReturnedUserDTO toReturn = await service.CreateAsync(user);


        return toReturn;
    }

    public async Task<UserInformationDto> GetUserInformationAsync(string email)
    {
        ReturnedUserDTO userDto = await service.GetUserById(email);
        if (userDto == null)
        {
            throw new Exception("User not found");
        }

        UserInformationDto userInformation = new UserInformationDto()
        {
            Address = userDto.Address,
            Email = userDto.Email,
            FirstName = userDto.FirstName,
            LastName = userDto.LastName,
            Phone = userDto.Phone,
            DriveLicense = userDto.DriveLicense
        };
        if (!string.IsNullOrEmpty(userDto.DriveLicense))
        {
            try
            {
                Car car = await _carService.GetByDriverIdAsync(userDto.Email);
                userInformation.CarInfo = car;
            }
            catch (Exception e)
            {
                Console.WriteLine(e);
                throw;
            }
        }

        return userInformation;
    }


    private static void ValidateUSer(User user)
    {
        if (user.Email.Length < 3)
        {
            throw new Exception("Email cannot bee less than 3 characters");
        }

        if (!user.Email.Contains('@'))
        {
            throw new Exception("Please enter a valid email missing (@)");
        }

        if (!user.Email.Contains('.'))
        {
            throw new Exception("Email must have a domain " + user.Email);
        }

        if (user.Phone.Length < 8)
        {
            throw new Exception("Phone Number must be at least 8 numbers");
        }

        if (user.Phone.Length > 12)
        {
            throw new Exception("Phone Number cannot be more than 12 numbers");
        }

        int i = 12345678;
        if (!int.TryParse(user.Phone, out i))
        {
            throw new Exception("please enter a valid phone number");
        }
    }
}