using Domain.DTOs;
using Domain.Model;
using gRPCClient.gRPC_Imp;
using Microsoft.AspNetCore.Mvc;

namespace WebAPI.Controllers;
[ApiController]
[Route("/test")]
public class Test : ControllerBase
{

    private readonly UserGrpcImp _gRpcClient;

    public Test(UserGrpcImp userGrpcImp)
    {
        this._gRpcClient = userGrpcImp;
    }

    

    [HttpPost]
    public async Task<ActionResult<ReturnedUserDTO>> CreatAsync(User user)
    {
        try
        {
            Console.WriteLine("Here");
            ReturnedUserDTO u = await _gRpcClient.CreateAsync(user);
            Console.WriteLine("Here2");
            return Created($"/users/{u.Email}", u);
        }
        catch (Exception e)
        {
            return StatusCode(500, e.Message);
        }
    }
}