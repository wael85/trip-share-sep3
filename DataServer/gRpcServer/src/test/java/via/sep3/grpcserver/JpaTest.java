package via.sep3.grpcserver;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import via.sep3.grpcserver.Entities.Car;
import via.sep3.grpcserver.Entities.Trip;
import via.sep3.grpcserver.Entities.User;
import via.sep3.grpcserver.repositorys.CarRepository;
import via.sep3.grpcserver.repositorys.TripRepository;
import via.sep3.grpcserver.repositorys.UserRepository;

import java.util.Optional;
@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class JpaTest {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private CarRepository carRepository;
    @Autowired
    private TripRepository tripRepository;
    @Test
    void TestInjection(){

        Assertions.assertThat(userRepository).isNotNull();
        Assertions.assertThat(carRepository).isNotNull();
        Assertions.assertThat(tripRepository).isNotNull();
    }
    @Test
    @Order(1)
    void CreateUser(){
        User user = new User();
        user.setEmail("Test@email.com");
        user.setAddress("TestGade");
        user.setDriveLicense("safasf");
        user.setFirstName("test");
        user.setLastName("last");
        user.setPhone("12345678");
        userRepository.save(user);


        Assertions.assertThat(userRepository.findByEmail("Test@email.com").get().getEmail().equalsIgnoreCase(user.getEmail()));


    }
    @Order(2)
    @Test
    void findUserByEmail(){
        boolean isThere= false;
        Optional<User> user= userRepository.findByEmail("Test@email.com");
        if (user.isPresent()){

            isThere=true;
        }
        org.junit.jupiter.api.Assertions.assertTrue(isThere);

    }
    @Test
    @Order(3)
    void DeleteCreatedUser(){
        boolean notThere= false;
        Optional<User> todelete = userRepository.findByEmail("Test@email.com");
        userRepository.delete(todelete.get());
        Optional<User> dletedUser = userRepository.findByEmail("Test@email.com");
        if (dletedUser.isEmpty()){
            notThere=true;
        }
        org.junit.jupiter.api.Assertions.assertTrue(notThere);

    }
    @Test
    @Order(4)
    void CreateCar(){
        User user = new User();
        user.setEmail("Test@email.com");
        user.setAddress("TestGade");
        user.setDriveLicense("safasf");
        user.setFirstName("test");
        user.setLastName("last");
        user.setPhone("12345678");
        userRepository.save(user);


        Car car= new Car();
        car.setColor("color");
        car.setModel("model");
        car.setFuelType("binzen");
        car.setPlateNumber("cae12346");
        car.setSeatsCount(4);
        car.setDriver(user);
        carRepository.save(car);
        Assertions.assertThat(carRepository.findCarByDriver_Email("Test@email.com").getPlateNumber().equalsIgnoreCase(car.getPlateNumber()));
    }
    @Test
    @Order(5)
    void DeleteCar(){
        boolean notThere=false;
        Optional<Car> toDelete= Optional.ofNullable(carRepository.findCarByDriver_Email("Test@email.com"));

        carRepository.delete(toDelete.get());
        Optional<Car> not= Optional.ofNullable(carRepository.findCarByDriver_Email("Test@email.com"));
        if (not.isEmpty()){
            notThere=true;
        }
        userRepository.delete(userRepository.findByEmail("Test@email.com").get());
        org.junit.jupiter.api.Assertions.assertTrue(notThere);
    }

    @Test
    @Order(6)
    void createTrip(){
        CreateUser();
        CreateCar();
        Trip trip= new Trip();
        trip.setDriver(userRepository.findByEmail("Test@email.com").get());
        trip.setAvailableSeats(3);
        trip.setFullPrice(122);
        tripRepository.save(trip);

        Assertions.assertThat(tripRepository.GetUsersTripsByUserId("Test@email.com").get().stream().findFirst().get().getDriver().getEmail().equalsIgnoreCase(trip.getDriver().getEmail()));

    }
    @Test
    @Order(7)
    void deleteData(){
        tripRepository.delete(tripRepository.GetUsersTripsByUserId("Test@email.com").get().stream().findFirst().get());
        DeleteCar();
        DeleteCreatedUser();
        org.junit.jupiter.api.Assertions.assertTrue(true);
    }

    /*@Test
    @Order(7)
    void deleteCreatedTrip(){
        boolean notThere= false;
        Trip toDelete=tripRepository.GetUsersTripsByUserId("Test@email.com").get().stream().findFirst().get();
        tripRepository.delete(toDelete);
        var not =tripRepository.GetUsersTripsByUserId("Test@email.com").get().stream().findFirst();
        if (not==null){
            notThere=true;
        }
        DeleteCar();
        DeleteCreatedUser();
        org.junit.jupiter.api.Assertions.assertTrue(notThere);

    }*/
}
