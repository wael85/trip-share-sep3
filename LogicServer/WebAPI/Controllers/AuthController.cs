using System.IdentityModel.Tokens.Jwt;
using System.Security.Claims;
using System.Text;
using Application.LogicInterface;
using Domain.DTOs;
using Microsoft.AspNetCore.Mvc;
using Microsoft.IdentityModel.Tokens;

namespace WebAPI.Controllers;

[ApiController]
[Route("[controller]")]
public class AuthController : ControllerBase
{
    private readonly IConfiguration config;
    private readonly IAuthLogic authLogic;

    public AuthController(IConfiguration config, IAuthLogic authLogic)
    {
        this.config = config;
        this.authLogic = authLogic;
    }
  
     private List<Claim> GenerateClaims(ReturnedUserDTO user)
        {
            var claims = new[]
            {
                new Claim(JwtRegisteredClaimNames.Sub, config["Jwt:Subject"]),
                new Claim(JwtRegisteredClaimNames.Jti, Guid.NewGuid().ToString()),
                new Claim(JwtRegisteredClaimNames.Iat, DateTime.UtcNow.ToString()),
                new Claim(ClaimTypes.Name, user.FirstName),
                new Claim(ClaimTypes.Surname,user.LastName),
                new Claim(ClaimTypes.Email, user.Email),
                new Claim("Address",user.Address),
                new Claim("Phone",user.Phone),
                new Claim("DriveLicense",user.DriveLicense!)
    
            };
            return claims.ToList();
        }
    
    private string GenerateJwt(ReturnedUserDTO user)
    {
        List<Claim> claims = GenerateClaims(user);
    
        SymmetricSecurityKey key = new SymmetricSecurityKey(Encoding.UTF8.GetBytes(config["Jwt:Key"]));
        SigningCredentials signIn = new SigningCredentials(key, SecurityAlgorithms.HmacSha512);
    
        JwtHeader header = new JwtHeader(signIn);
    
        JwtPayload payload = new JwtPayload(
            config["Jwt:Issuer"],
            config["Jwt:Audience"],
            claims, 
            null,
            DateTime.UtcNow.AddMinutes(60));
    
        JwtSecurityToken token = new JwtSecurityToken(header, payload);
    
        string serializedToken = new JwtSecurityTokenHandler().WriteToken(token);
        return serializedToken;
    }
     
    [HttpPost, Route("login")]
    public async Task<ActionResult> Login([FromBody] UserLoginDto userLoginDto)
    {
        try
        {
            ReturnedUserDTO user = await authLogic.ValidateUserAsync(userLoginDto);

            string token = GenerateJwt(user);
            
            return Ok(token);
        }
        catch (Exception e)
        {
            Console.WriteLine(e.Message);
            return StatusCode(500, e.Message);
        }
    }
}