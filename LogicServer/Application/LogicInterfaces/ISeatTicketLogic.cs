using Domain.DTOs;
using Domain.Model;

namespace Application.LogicInterfaces;

public interface ISeatTicketLogic
{
    Task<IEnumerable<SeatTicket>> GetTicketsByUserIdAsync(string email);
    Task<SeatTicket> CreateAsync(CreateSeatTicketDto ticketDto);
    Task DeleteAsync(long id);
}