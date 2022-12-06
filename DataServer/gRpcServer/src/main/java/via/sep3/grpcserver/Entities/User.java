package via.sep3.grpcserver.Entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "user",schema = "trip_share")
public class User {
    @Id
    @Column(unique = true ,nullable = false)
    private String email;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false)
    private String phone;
    @Column(nullable = false)
    private String address;
    @Column(name = "drive_license" ,unique = true)
    private String driveLicense;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "driver",cascade = CascadeType.ALL,orphanRemoval = true)
    private Set<Trip> trips=new HashSet<>();

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "passenger",cascade = CascadeType.ALL,orphanRemoval = true)
    private Set<SeatTicket> tickets=new HashSet<>();
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "consumer",cascade = CascadeType.ALL,orphanRemoval = true)
    private Set<Notification> receivedNotifications=new HashSet<>();
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "sender",cascade = CascadeType.ALL,orphanRemoval = true)
    private Set<Notification> sentNotifications =new HashSet<>();

    public User() {
    }
    public void addSeatTicket(SeatTicket seatTicket){
        seatTicket.setPassenger(this);
        tickets.add(seatTicket);
    }
    public void removeSeatTicket(SeatTicket seatTicket){
        seatTicket.setPassenger(null);
        tickets.remove(seatTicket);
    }
    public void addTrip(Trip trip){
        trips.add(trip);
        trip.setDriver(this);
    }
    public void removeTrip(Trip trip){
        trips.remove(trip);
        trip.setDriver(null);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set<Trip> getTrips() {
        return trips;
    }

    public void setTrips(Set<Trip> trips) {
        this.trips = trips;
    }

    public Set<SeatTicket> getTickets() {
        return tickets;
    }

    public void setTickets(Set<SeatTicket> tickets) {
        this.tickets = tickets;
    }

    public String getDriveLicense() {
        return driveLicense;
    }

    public void setDriveLicense(String driveLicense) {
        this.driveLicense = driveLicense;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(email, user.email);
    }

}
