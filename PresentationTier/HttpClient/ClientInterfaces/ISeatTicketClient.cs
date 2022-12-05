using Domain.DTOs;
using Domain.Model;

namespace HttpClient.ClientInterfaces;

public interface ISeatTicketClient
{
    Task<IEnumerable<SeatTicket>> GetTicketsByUserIdAsync(string id);
    Task CancelTicketAsync(long id);
    Task<SeatTicket> ReserveTicketAsync(CreateSeatTicketDto seatTicketDto);
}