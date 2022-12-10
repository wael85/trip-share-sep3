using Domain.Model;

namespace Domain.DTOs;

public class RatingCreationDTO
{
    public UserInformationDto Writer { get; set; }
    public UserInformationDto Subject { get; set; }
    public int Value { get; set; }
    public string Comment { get; set; }
    
    public RatingCreationDTO (UserInformationDto writer, UserInformationDto subject, int value, string comment)
    {
        this.Writer = writer;
        this.Subject = subject;
        this.Value = value;
        this.Comment = comment;
    }
}