using Domain.Model;

namespace Domain.DTOs;

public class RatingCreationDTO
{
    public User Writer { get; set; }
    public User Subject { get; set; }
    public int Value { get; set; }
    public string Comment { get; set; }
    
    public RatingCreationDTO (User writer, User subject, int value, string comment)
    {
        this.Writer = writer;
        this.Subject = subject;
        this.Value = value;
        this.Comment = comment;
    }
}