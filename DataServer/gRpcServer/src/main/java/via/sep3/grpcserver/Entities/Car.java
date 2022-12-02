package via.sep3.grpcserver.Entities;

import org.checkerframework.checker.signature.qual.Identifier;

import javax.persistence.*;

@Entity
@Table(name = "car",schema = "trip_share")
public class Car {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false,unique = true)
    private String plateNumber;


    @OneToOne
    @JoinColumn(name = "fk_drive_id",unique = true,nullable = false,referencedColumnName = "email")
    private User driver;
    @Column(nullable = false)
    private String color;
    @Column(nullable = false)
    private int seatsCount;
    @Column(nullable = false)
    private String fuelType;
    @Column
    private String model;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getDriver() {
        return driver;
    }

    public void setDriver(User driver) {
        this.driver = driver;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSeatsCount() {
        return seatsCount;
    }

    public void setSeatsCount(int seatsCount) {
        this.seatsCount = seatsCount;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
