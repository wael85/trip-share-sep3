using Application.LogicInterfaces;
using Domain.Model;
using Microsoft.AspNetCore.Mvc;

namespace WebAPI.Controllers;
[ApiController]
[Route("[controller]")]
public class SeatTicketsController:ControllerBase
{

    private readonly ISeatTicketLogic _seatTicketLogic;

    public SeatTicketsController(ISeatTicketLogic seatTicketLogic)
    {
        _seatTicketLogic = seatTicketLogic;
    }

    [HttpGet("{id}")]
    public async Task<ActionResult<IEnumerable<SeatTicket>>> GetTicketsByUserIdAsync( [FromRoute] string id)
    {
        try
        {
            IEnumerable<SeatTicket> result = await _seatTicketLogic.GetTicketsByUserIdAsync(id);
            return Ok(result);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }

}