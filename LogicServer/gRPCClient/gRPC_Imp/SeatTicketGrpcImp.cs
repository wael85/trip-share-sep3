using Application.GrpcInterfaces;
using Domain.DTOs;
using Domain.Model;
using Grpc.Core;
using gRPCClient.GrpcInterfaces;

namespace gRPCClient.gRPC_Imp;

public class SeatTicketGrpcImp:ISeatTicketService
{
    private readonly IUserService _userService;
    private readonly TicketServices.TicketServicesClient _ticketClient;

    public SeatTicketGrpcImp(IUserService userService, TicketServices.TicketServicesClient ticketClient)
    {
        _userService = userService;
        _ticketClient = ticketClient;
    }

    public async Task<IEnumerable<SeatTicket>> GetTicketsByUserIdAsync(string email)
    {
        ReturnedUserDTO dto = await _userService.GetUserById(email);
        User passenger = new User(dto.Email, "**", dto.FirstName, dto.LastName, dto.Phone, dto.Address,
            dto.DriveLicense);
        TicketsByUserId request = new TicketsByUserId
        {
            Email = email
        };

        var reply = await _ticketClient.getAllUserTicketAsync(request);
        List<SeatTicket> tickets = new List<SeatTicket>();
        
        foreach (var l in reply.Tickets)
        {
            Location pick = new Location()
            {
                Id = l.Pickup.Id,
                PostCode = l.Pickup.PostCode,
                City = l.Pickup.City,
                StreetName = l.Pickup.StreetName,
                StreetNumber = l.Pickup.StreetNumber,
                ArrivalTime = new DateTime(l.Pickup.ArrivalTime)
            };
            Location drop = new Location()
            {
                Id = l.Dropoff.Id,
                PostCode = l.Dropoff.PostCode,
                City = l.Dropoff.City,
                StreetName = l.Dropoff.StreetName,
                StreetNumber = l.Dropoff.StreetNumber,
                ArrivalTime = new DateTime(l.Dropoff.ArrivalTime)
            };
            
            SeatTicket st = new SeatTicket
            {
               Id = l.Id,
               Passenger = passenger,
               SeatPrice = l.SeatPrice,
               SeatAmount = l.TotalSeats,
               PickUpLocation = pick,
               DropLocation = drop
            };
            tickets.Add(st);
        }

        return tickets;
    }
}