using Application.LogicInterfaces;
using Domain.DTOs;
using Domain.Model;
using Microsoft.AspNetCore.Mvc;

namespace WebAPI.Controllers;

[ApiController]
[Route("[controller]")]
public class RatingsController : ControllerBase
{
    private readonly IRatingLogic _logic;

    public RatingsController(IRatingLogic logic)
    {
        _logic = logic;
    }
    
    [HttpPost]
    public async Task<ActionResult<Rating>> CreateAsync([FromBody] RatingCreationDTO rating)
    {
        try
        {
            Rating result = await _logic.CreateAsync(rating);
            return Created($"/ratings/{result.Id}", result);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
    
    // [HttpGet("{id}")]
    // public async Task<ActionResult<Rating>> GetAsync([FromRoute] long id)
    // {
    //     try
    //     {
    //         var rating = await _logic.GetAsync(id);
    //         return Ok(rating);
    //     }
    //     catch (Exception e)
    //     {
    //         Console.WriteLine(e);
    //         return NotFound(e.Message);
    //     }
    // }
    
    [HttpGet]
    public async Task<ActionResult<List<Rating>>> GetAsync([FromQuery] string? writerEmail, [FromQuery] string? subjectEmail)
    {
        try
        {
            List<Rating> ratings;

            if (writerEmail == null && subjectEmail == null)
            {
                return BadRequest();
            }
            else if (writerEmail != null && subjectEmail != null)
            {
                return BadRequest();
            }
            else
            {
                if (writerEmail != null)
                    ratings = await _logic.GetFromWriterAsync(writerEmail);
                
                ratings = await _logic.GetFromSubjectAsync(subjectEmail);
            }

            return Ok(ratings);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
    
    [HttpGet("Mean")]
    public async Task<ActionResult<RatingMeanDTO>> GetAsync([FromQuery] string? subjectEmail)
    {
        try
        {
            if (subjectEmail == null)
                return BadRequest();

            var mean = await _logic.GetMeanFromSubjectAsync(subjectEmail);
            return Ok(mean);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
}