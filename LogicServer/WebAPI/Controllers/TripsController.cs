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
    public async Task<ActionResult<Trip>> CreateAsync([FromBody]TripCreationDto trip)
    {
        try
        {
            Trip trip1 =   await logic.CreateAsync(trip);
            return Created($"/trips/{trip1.Id}",trip1);

        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }


}