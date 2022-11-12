using Application.LogicInterfaces;
using Domain.DTOs;
using Domain.Model;
using Microsoft.AspNetCore.Mvc;

namespace WebAPI.Controllers;

[ApiController]
[Route("[controller]")]
public class CarsController : ControllerBase
{
    private readonly IRegisterCarLogic _carLogic;

    public CarsController(IRegisterCarLogic carLogic)
    {
        _carLogic = carLogic;
    }

    [HttpPost]
    public async Task<ActionResult<Car>> CreateAsync([FromBody]BeADriverRequestDto dto)
    {
        try
        {
            
            Car returned = await _carLogic.RegisterAsync(dto);
            return Created($"/cars/{dto.DriveLicense}", returned);
            

        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
}