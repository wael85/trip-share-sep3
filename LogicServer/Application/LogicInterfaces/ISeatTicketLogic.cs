using Domain.Model;

namespace Application.LogicInterfaces;

public interface ISeatTicketLogic
{
    Task<IEnumerable<SeatTicket>> GetTicketsByUserIdAsync(string email);
}