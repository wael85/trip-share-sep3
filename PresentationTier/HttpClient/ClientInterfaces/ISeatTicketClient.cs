using Domain.Model;

namespace HttpClient.ClientInterfaces;

public interface ISeatTicketClient
{
    Task<IEnumerable<SeatTicket>> GetTicketsByUserIdAsync(string id);
    Task CancelTicketAsync(long id);
}