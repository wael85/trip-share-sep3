using Application.GrpcInterfaces;
using Application.LogicInterfaces;
using Domain.Model;

namespace Application.Logic;

public class SeatTicketLogic:ISeatTicketLogic
{

    private readonly ISeatTicketService _ticketService;

    public SeatTicketLogic(ISeatTicketService ticketService)
    {
        _ticketService = ticketService;
    }

    public async Task<IEnumerable<SeatTicket>> GetTicketsByUserIdAsync(string email)
    {
        IEnumerable<SeatTicket> result =  await _ticketService.GetTicketsByUserIdAsync(email);
        return result;

    }
}