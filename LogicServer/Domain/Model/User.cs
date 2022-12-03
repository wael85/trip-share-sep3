namespace Domain.Model;

public class User
{
    
    public string Email { get; set; }
    public string Password { get; set; }
    public string FirstName { get; set; }
    public string LastName { get; set; }
    public string Phone { get; set; }
    public string Address { get; set; }
    public string? DriveLicense { get; set; }

    public User(string email, string password, string firstName, string lastName, string phone, string address, string? driveLicense)
    {
        Email = email;
        Password = password;
        FirstName = firstName;
        LastName = lastName;
        Phone = phone;
        Address = address;
        DriveLicense = driveLicense;
    }

    public User(){}
}