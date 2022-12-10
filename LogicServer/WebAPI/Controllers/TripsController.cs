using Application.LogicInterfaces;
using Domain.DTOs;
using Domain.Model;
using Microsoft.AspNetCore.Authorization;
using Microsoft.AspNetCore.Mvc;

namespace WebAPI.Controllers;
[ApiController]
[Route("[Controller]")]
[Authorize]
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
            Trip retuTrip = await logic.CreateAsync(dto);
            return Created($"/trips/{retuTrip.Id}",retuTrip);

        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }

    [HttpGet]
    public async Task<ActionResult<List<Trip>>> GetAsync([FromQuery] TripSearchQuery? query)
    {
        try
        {
            List<Trip> trips;

            if (query == null)
            {
                trips = await logic.GetAllAsync();
            }
            else
            {
                if (!(query.MaxPrice > 0) || query.PassengerAmount < 1)
                    return BadRequest();
                
                trips = await logic.QueryAsync(query.Pickup, query.Dropoff, query.PassengerAmount, query.MaxPrice, query.TripDateTime);
            }

            return Ok(trips);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
    [HttpGet("/user-trips")]
    public async Task<ActionResult<List<Trip>>> GetUsersTripsByEmail([FromQuery] string email)
    {
        try
        {
            List<Trip> trips = await logic.GetUsersTripsByEmail(email);
            return Ok(trips);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
}