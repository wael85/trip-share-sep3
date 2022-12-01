using Application.LogicInterfaces;
using Domain.DTOs;
using Domain.Model;
using Microsoft.AspNetCore.Mvc;

namespace WebAPI.Controllers;
[ApiController]
[Route("[controller]")]

public class UsersController :ControllerBase
{
    private readonly IUserLogic userLogic;

    public UsersController(IUserLogic userLogic)
    {
        this.userLogic = userLogic;
    }

    [HttpPost]
    public async Task<ActionResult<ReturnedUserDTO>> CreateAsync([FromBody]User user)
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

    [HttpGet]
    public async Task<ActionResult<ReturnedUserDTO>> GetUserByEmailAsync([FromQuery] string email)
    {
        try
        {
            ReturnedUserDTO toReturn = await userLogic.GetUserByEmailAsync(email);
            return Ok(toReturn);

        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
    
}