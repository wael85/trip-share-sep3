using Application.LogicInterfaces;
using Domain.DTOs;
using Domain.Model;
using Microsoft.AspNetCore.Mvc;

namespace WebAPI.Controllers;
[ApiController]
[Route("[controller")]

public class UserController :ControllerBase
{
    private readonly IUserLogic userLogic;

    public UserController(IUserLogic userLogic)
    {
        this.userLogic = userLogic;
    }

    [HttpPost]
    public async Task<ActionResult<ReturnedUserDTO>> CreateAsync(User user)
    {
        try
        {
            ReturnedUserDTO returnedUserDto = await userLogic.CreateAsync(user);
            return Created($"/users/{returnedUserDto.Email}", returnedUserDto);
            

        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
    
}