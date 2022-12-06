package via.sep3.grpcserver.Entities;

import javax.persistence.*;

@Entity
@Table(name= "seat_ticket" ,schema = "trip_share")
public class SeatTicket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private double seatPrice;
    @Column(nullable = false)
    private int totalSeats;
    @ManyToOne(fetch = FetchType.LAZY,cascade = {CascadeType.DETACH})
    @JoinColumn(nullable=false, name = "passenger_id")
    private User passenger;
    @ManyToOne(fetch = FetchType.LAZY,cascade = {CascadeType.DETACH})
    @JoinColumn(nullable=false)
    private Trip trip;
    @ManyToOne(cascade ={CascadeType.DETACH} )
    @JoinColumn(nullable=false)
    private Location pickUpLocation;
    @ManyToOne(cascade = {CascadeType.DETACH})
    @JoinColumn(nullable=false)
    private Location dropLocation;

    public SeatTicket() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public User getPassenger() {
        return passenger;
    }

    public void setPassenger(User passenger) {
        this.passenger = passenger;
    }

    public double getSeatPrice() {
        return seatPrice;
    }

    public void setSeatPrice(double seatPrice) {
        this.seatPrice = seatPrice;
    }

    public Location getPickUpLocation() {
        return pickUpLocation;
    }

    public void setPickUpLocation(Location pickUpLocation) {
        this.pickUpLocation = pickUpLocation;
    }

    public Location getDropLocation() {
        return dropLocation;
    }

    public void setDropLocation(Location dropLocation) {
        this.dropLocation = dropLocation;
    }

    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }
}
