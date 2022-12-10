namespace Domain.DTOs;

public class RatingMeanDTO
{
    public double Rating { get; set; }
    public double Count { get; set; }

    public RatingMeanDTO(double rating, int count)
    {
        Rating = rating;
        Count = count;
    }
    
    public RatingMeanDTO()
    {
    }
}