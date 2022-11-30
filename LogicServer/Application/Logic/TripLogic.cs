using Application.GrpcInterfaces;
using Application.LogicInterfaces;
using Domain.DTOs;
using Domain.Model;
using gRPCClient.GrpcInterfaces;

namespace Application.Logic;

public class TripLogic : ITripLogic
{
    private readonly IUserService UserService;
    private readonly ITripServices TripServices;

    public TripLogic(IUserService userService, ITripServices tripServices)
    {
        UserService = userService;
        TripServices = tripServices;
    }

    public async Task<Trip> CreateAsync(TripCreationDto dto)
    {
        return await TripServices.CreateAsync(dto);
        
    }
}