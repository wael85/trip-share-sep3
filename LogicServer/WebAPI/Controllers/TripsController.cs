using Application.LogicInterfaces;
using Domain.DTOs;
using Domain.Model;
using Grpc.Core;
using Microsoft.AspNetCore.Mvc;

namespace WebAPI.Controllers;
[ApiController]
[Route("[Controller]")]

public class TripsController : ControllerBase
{
    private readonly ITripLogic logic;

    public TripsController(ITripLogic logic)
    {
        this.logic = logic;
    }

    [HttpPost]
    public async Task<ActionResult<Trip>> CreateAsync([FromBody]TripCreationDto dto)
    {
        try
        {
            Console.WriteLine("at calling the end point");
            Trip retuTrip =   await logic.CreateAsync(dto);
            return Created($"/trips/{retuTrip.Id}",retuTrip);

        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }


}