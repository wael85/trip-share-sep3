package via.sep3.grpcserver.Entities;

import com.google.type.DateTime;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "location" ,schema = "trip_share")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String postCode;
    @Column(nullable = false)
    private String city;
    @Column(nullable = false)
    private String streetName;

    @Column(nullable = false)
    private String StreetNumber;
    @Column(nullable = false)
    private LocalDateTime arrivalTime;
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(nullable=false)
    private Trip trip;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "pickUpLocation",cascade = CascadeType.ALL)
    private Set<SeatTicket> pickUpLocations =new HashSet<>();

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "dropLocation",cascade = CascadeType.ALL)
    private Set<SeatTicket>dropLocations=new HashSet<>();


    public Set<SeatTicket> getPickUpLocations() {
        return pickUpLocations;
    }

    public void setPickUpLocations(Set<SeatTicket> pickUpLocations) {
        this.pickUpLocations = pickUpLocations;
    }

    public Set<SeatTicket> getDropLocations() {
        return dropLocations;
    }

    public void setDropLocations(Set<SeatTicket> dropLocations) {
        this.dropLocations = dropLocations;
    }

    public Location() {
    }

    public void addDropLocation(SeatTicket endTicket){
        dropLocations.add(endTicket);
        endTicket.setDropLocation(this);
    }

    public void addPickUpLocation(SeatTicket startTicket){
        pickUpLocations.add(startTicket);
        startTicket.setPickUpLocation(this);
    }

    public String getStreetNumber() {
        return StreetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        StreetNumber = streetNumber;
    }

    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

}
