namespace Domain.Model;

public class Rating
{
    public long Id { get; }
    public User Writer { get; set; }
    public User Subject { get; set; }
    public int Value { get; set; }
    public string Comment { get; set; }
    
    public Rating (long id, User writer, User subject, int value, string comment)
    {
        this.Id = id;
        this.Writer = writer;
        this.Subject = subject;
        this.Value = value;
        this.Comment = comment;
    }
}