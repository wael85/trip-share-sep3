package via.sep3.grpcserver.Entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(schema = "trip_share")
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private int fullPrice;
    @Column(nullable = false)
    private int availableSeats;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable=false,name = "driver_id")
    private User driver;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "trip",cascade = CascadeType.ALL,orphanRemoval = true)
    private Set<SeatTicket> tickets=new HashSet<>();

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "trip",cascade = CascadeType.ALL,orphanRemoval = true)
    private Set<Location>stops=new HashSet<>();

    public Trip() {

    }
    public void addStopLocation(Location stopLocation){
        stops.add(stopLocation);
        stopLocation.setTrip(this);
    }
    public void removeStopLocation(Location stopLocation){
        stops.remove(stopLocation);
        stopLocation.setTrip(null);
    }
    public void addSeatTicket(SeatTicket seatTicket){
        tickets.add(seatTicket);
        seatTicket.setTrip(this);
    }
    public void removeSeatTicket(SeatTicket seatTicket){
        tickets.remove(seatTicket);
        seatTicket.setTrip(null);
    }
    public Set<SeatTicket> getTickets() {
        return tickets;
    }

    public void setTickets(Set<SeatTicket> tickets) {
        this.tickets = tickets;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getFullPrice() {
        return fullPrice;
    }

    public void setFullPrice(int fullPrice) {
        this.fullPrice = fullPrice;
    }

    public User getDriver() {
        return driver;
    }

    public void setDriver(User driver) {
        this.driver = driver;
    }

}