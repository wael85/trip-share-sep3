using Domain.Model;

namespace Domain.DTOs;

public class UserInformationDto
{
    public string Email { get; set; }
    public string FirstName { get; set; }
    public string LastName { get; set; }
    public string Phone { get; set; }
    public string Address { get; set; }
    public string? DriveLicense { get; set; }
    public Car? CarInfo { get; set; }
}