using Domain.DTOs;
using Domain.Model;

namespace Application.GrpcInterfaces;

public interface ISeatTicketService
{ 
    Task<IEnumerable<SeatTicket>>GetTicketsByUserIdAsync(string email);
    Task<SeatTicket> CreateAsync(CreateSeatTicketDto ticketDto);
    Task DeleteAsync(long id);
}