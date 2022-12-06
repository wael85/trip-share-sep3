package via.sep3.grpcserver.Entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "notification" , schema = "trip_share")
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne(cascade ={CascadeType.DETACH} )
    @JoinColumn(nullable=false)
    private  User consumer;
    @ManyToOne(cascade ={CascadeType.DETACH} )
    @JoinColumn(nullable=false)
    private  User sender;

    @OneToOne
    @JoinColumn(nullable=false)
    private Location requestedPickUpLocation;
    @OneToOne
    @JoinColumn(nullable=false)
    private Location requestedDropLocation;

    @OneToOne
    @JoinColumn(nullable=false)
    private Trip requestedTrip;
    @Column
    private double seatPrice;
    @Column
    private int seatCount;
    @Column
    private String msg;
    @Column
    private boolean consumed;

    public Notification() {

    }

    public Trip getRequestedTrip() {
        return requestedTrip;
    }

    public void setRequestedTrip(Trip requestedTrip) {
        this.requestedTrip = requestedTrip;
    }

    public boolean isConsumed() {
        return consumed;
    }

    public void setConsumed(boolean consumed) {
        this.consumed = consumed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getConsumer() {
        return consumer;
    }

    public void setConsumer(User consumer) {
        this.consumer = consumer;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public Location getRequestedPickUpLocation() {
        return requestedPickUpLocation;
    }

    public void setRequestedPickUpLocation(Location requestedPickUpLocation) {
        this.requestedPickUpLocation = requestedPickUpLocation;
    }

    public Location getRequestedDropLocation() {
        return requestedDropLocation;
    }

    public void setRequestedDropLocation(Location requestedDropLocation) {
        this.requestedDropLocation = requestedDropLocation;
    }

    public double getSeatPrice() {
        return seatPrice;
    }

    public void setSeatPrice(double seatPrice) {
        this.seatPrice = seatPrice;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
