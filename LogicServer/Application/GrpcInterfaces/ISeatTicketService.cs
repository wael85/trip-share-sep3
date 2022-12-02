using Domain.Model;

namespace Application.GrpcInterfaces;

public interface ISeatTicketService
{ 
    Task<IEnumerable<SeatTicket>>GetTicketsByUserIdAsync(string email);
}