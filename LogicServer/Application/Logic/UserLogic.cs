using Application.LogicInterfaces;
using gRPCClient.GrpcInterfaces;

namespace Application.Logic;

public class UserLogic:IUserLogic
{
    private readonly IUserService _service;
}