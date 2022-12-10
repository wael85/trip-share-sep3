using Application.GrpcInterfaces;
using Domain.DTOs;
using Domain.Model;

namespace gRPCClient.gRPC_Imp;

public class RatingGrpcImp : IRatingService
{
    private readonly RatingServices.RatingServicesClient _client;
    private readonly UserServices.UserServicesClient _userClient;
    
    public RatingGrpcImp(RatingServices.RatingServicesClient client, UserServices.UserServicesClient userClient)
    {
        _client = client;
        _userClient = userClient;
    }
    
    public async Task<Rating> CreateAsync(RatingCreationDTO dto)
    {
        var response = await _client.CreateRatingAsync(new RatingCreationRequest()
        {
            Rating = dto.Value,
            RatingComment = dto.Comment,
            SubjectEmail = dto.Subject.Email,
            WriterEmail = dto.Writer.Email
        });

        var writerResponse = await _userClient.GetUserByIdAsync(new GetUserRequest() { Email = response.WriterEmail });
        var writer = new User()
        {
            Address = writerResponse.Address,
            Email = writerResponse.Email,
            FirstName = writerResponse.FirstName,
            LastName = writerResponse.LastName,
            Phone = writerResponse.Phone
        };
        var subjectResponse = await _userClient.GetUserByIdAsync(new GetUserRequest() { Email = response.SubjectEmail });
        var subject = new User()
        {
            Address = subjectResponse.Address,
            Email = subjectResponse.Email,
            FirstName = subjectResponse.FirstName,
            LastName = subjectResponse.LastName,
            Phone = subjectResponse.Phone
        };
        
        var rating = new Rating(
            response.RatingId,
            writer,
            subject,
            response.Rating,
            response.RatingComment
        );

        return rating;
    }

    public async Task<Rating> GetAsync(long ratingId)
    {
        var response = await _client.GetRatingByIdAsync(new RatingIdRequest()
        {
            Id = ratingId
        });

        var writerResponse = await _userClient.GetUserByIdAsync(new GetUserRequest() { Email = response.WriterEmail });
        var writer = new User()
        {
            Address = writerResponse.Address,
            Email = writerResponse.Email,
            FirstName = writerResponse.FirstName,
            LastName = writerResponse.LastName,
            Phone = writerResponse.Phone
        };
        var subjectResponse = await _userClient.GetUserByIdAsync(new GetUserRequest() { Email = response.SubjectEmail });
        var subject = new User()
        {
            Address = subjectResponse.Address,
            Email = subjectResponse.Email,
            FirstName = subjectResponse.FirstName,
            LastName = subjectResponse.LastName,
            Phone = subjectResponse.Phone
        };
        
        var rating = new Rating(
            response.RatingId,
            writer,
            subject,
            response.Rating,
            response.RatingComment
        );

        return rating;
    }

    public async Task<List<Rating>> GetAllAsync()
    {
        var response = await _client.GetAllRatingsAsync(new GetAllRequest());
        var ratings = new List<Rating>();

        foreach (var responseRating in response.Ratings)
        {
            var writerResponse = await _userClient.GetUserByIdAsync(new GetUserRequest() { Email = responseRating.WriterEmail });
            var writer = new User()
            {
                Address = writerResponse.Address,
                Email = writerResponse.Email,
                FirstName = writerResponse.FirstName,
                LastName = writerResponse.LastName,
                Phone = writerResponse.Phone
            };
            var subjectResponse = await _userClient.GetUserByIdAsync(new GetUserRequest() { Email = responseRating.SubjectEmail });
            var subject = new User()
            {
                Address = subjectResponse.Address,
                Email = subjectResponse.Email,
                FirstName = subjectResponse.FirstName,
                LastName = subjectResponse.LastName,
                Phone = subjectResponse.Phone
            };
        
            ratings.Add(new Rating(
                responseRating.RatingId,
                writer,
                subject,
                responseRating.Rating,
                responseRating.RatingComment
            ));
        }

        return ratings;
    }

    public async Task<List<Rating>> GetFromWriterAsync(string writerId)
    {
        var response = await _client.GetRatingsByWriterEmailAsync(new UserEmailRequest() { Email = writerId });
        var ratings = new List<Rating>();

        foreach (var responseRating in response.Ratings)
        {
            var writerResponse = await _userClient.GetUserByIdAsync(new GetUserRequest() { Email = responseRating.WriterEmail });
            var writer = new User()
            {
                Address = writerResponse.Address,
                Email = writerResponse.Email,
                FirstName = writerResponse.FirstName,
                LastName = writerResponse.LastName,
                Phone = writerResponse.Phone
            };
            var subjectResponse = await _userClient.GetUserByIdAsync(new GetUserRequest() { Email = responseRating.SubjectEmail });
            var subject = new User()
            {
                Address = subjectResponse.Address,
                Email = subjectResponse.Email,
                FirstName = subjectResponse.FirstName,
                LastName = subjectResponse.LastName,
                Phone = subjectResponse.Phone
            };
        
            ratings.Add(new Rating(
                responseRating.RatingId,
                writer,
                subject,
                responseRating.Rating,
                responseRating.RatingComment
            ));
        }

        return ratings;
    }

    public async Task<List<Rating>> GetFromSubjectAsync(string subjectId)
    {
        var response = await _client.GetRatingsBySubjectEmailAsync(new UserEmailRequest() { Email = subjectId });
        var ratings = new List<Rating>();

        foreach (var responseRating in response.Ratings)
        {
            var writerResponse = await _userClient.GetUserByIdAsync(new GetUserRequest() { Email = responseRating.WriterEmail });
            var writer = new User()
            {
                Address = writerResponse.Address,
                Email = writerResponse.Email,
                FirstName = writerResponse.FirstName,
                LastName = writerResponse.LastName,
                Phone = writerResponse.Phone
            };
            var subjectResponse = await _userClient.GetUserByIdAsync(new GetUserRequest() { Email = responseRating.SubjectEmail });
            var subject = new User()
            {
                Address = subjectResponse.Address,
                Email = subjectResponse.Email,
                FirstName = subjectResponse.FirstName,
                LastName = subjectResponse.LastName,
                Phone = subjectResponse.Phone
            };
        
            ratings.Add( new Rating(
                responseRating.RatingId,
                writer,
                subject,
                responseRating.Rating,
                responseRating.RatingComment
            ));
        }

        return ratings;
    }
}