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
            Location pick = BuildLocation(l.Pickup);
            Location drop = BuildLocation(l.Dropoff);
            
            SeatTicket st = new SeatTicket
            {
               Id = l.Id,
               Passenger = passenger,
               SeatPrice = l.SeatPrice,
               SeatAmount = l.TotalSeats,
               PickUpLocation = pick,
               DropLocation = drop,
               TripId = l.TripId
            };
            tickets.Add(st);
        }

        return tickets;
    }

    public async Task<SeatTicket> CreateAsync(CreateSeatTicketDto ticketDto)
    {
        SeatTicketCreationRequest creationRequest = new()
        {
            SeatPrice = ticketDto.SeatPrice,
            TotalSeats = ticketDto.SeatAmount,
            PassengerId = ticketDto.PassengerId,
            TripId = ticketDto.TripId,
            PickupId = ticketDto.PickUpLocationId,
            DropoffId = ticketDto.DropLocationId
        };
        var request = _ticketClient.createTicket(creationRequest);
        ReturnedUserDTO dto = await _userService.GetUserById(request.PassengerId);
        User passenger = new User(dto.Email, "**", dto.FirstName, dto.LastName, dto.Phone, dto.Address,
            dto.DriveLicense);

        SeatTicket seatTicket = new()
        {
            Id = request.Id,
            SeatAmount = request.TotalSeats,
            SeatPrice = request.SeatPrice,
            TripId = request.TripId,
            Passenger = passenger,
            PickUpLocation = BuildLocation(request.Pickup),
            DropLocation = BuildLocation(request.Dropoff)
        };
        return seatTicket;


    }

    public async Task DeleteAsync(long id)
    {
        TicketIdMessage request = new()
        {
            Id = id
        };
       await _ticketClient.deleteByIdAsync(request);
      
      
    }

    private Location BuildLocation(LocationMessage locationMessage)
    {
        Location location = new Location()
        {
            Id = locationMessage.Id,
            PostCode = locationMessage.PostCode,
            City = locationMessage.City,
            StreetName = locationMessage.StreetName,
            StreetNumber = locationMessage.StreetNumber,
            ArrivalTime = DateTime.Parse(locationMessage.ArrivalTime)
        };

        return location;
    }

}