using Application.GrpcInterfaces;
using Application.LogicInterfaces;
using Domain.DTOs;
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

    public async Task<SeatTicket> CreateAsync(CreateSeatTicketDto ticketDto)
    {
        SeatTicket result = await _ticketService.CreateAsync(ticketDto);
        
        return result;
    }

    public async Task DeleteAsync(long id)
    {
        await _ticketService.DeleteAsync(id);
    }
}