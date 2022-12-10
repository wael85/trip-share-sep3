using Application.LogicInterfaces;
using Domain.DTOs;
using Domain.Model;
using Microsoft.AspNetCore.Mvc;

namespace WebAPI.Controllers;

[ApiController]
[Route("[controller]")]
public class CarsController : ControllerBase
{
    private readonly ICarLogic _carLogic;

    public CarsController(ICarLogic carLogic)
    {
        _carLogic = carLogic;
    }

    [HttpPost]
    public async Task<ActionResult<Car>> CreateAsync([FromBody] BeADriverRequestDto dto)
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

    [HttpGet]
    [Route("verify")]
    public async Task<ActionResult<Car?>> VerifyCar([FromQuery] string plateNumber)
    {
        try
        {
            Car? existed = await _carLogic.VerifyCar(plateNumber);
            return Ok(existed);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }

        


    }
}