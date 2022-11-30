
package via.sep3.grpcserver.services;

import io.grpc.Metadata;
import io.grpc.StatusException;
import io.grpc.protobuf.ProtoUtils;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;
import via.sep3.grpcserver.Entities.Car;
import via.sep3.grpcserver.Entities.User;
import via.sep3.grpcserver.protobuf.carservices.CarServicesGrpc;
import via.sep3.grpcserver.protobuf.carservices.ErrorResponse;
import via.sep3.grpcserver.protobuf.carservices.RequestCarInfo;
import via.sep3.grpcserver.protobuf.carservices.ResponseCarInfo;
import via.sep3.grpcserver.repositorys.CarRepository;
import via.sep3.grpcserver.repositorys.UserRepository;

import java.util.Optional;

@GRpcService
public class CarService extends CarServicesGrpc.CarServicesImplBase {
    private final CarRepository carRepository;
    private final UserRepository userRepository;

    @Autowired
    public CarService(CarRepository carRepository, UserRepository userRepository) {
        this.carRepository = carRepository;
        this.userRepository = userRepository;
    }
    @Override
    public void createCar(RequestCarInfo requestCarInfo, StreamObserver<ResponseCarInfo> responseCarInfo) {
       Optional<User> driver = userRepository.findByDriveLicense(requestCarInfo.getDriverDriveLicense());
        Car car = new Car();
        car.setModel(requestCarInfo.getModel());
        car.setPlateNumber(requestCarInfo.getPlateNumber());
        car.setColor(requestCarInfo.getColor());
        car.setFuelType(requestCarInfo.getFuelType());
        car.setSeatsCount(requestCarInfo.getSeatsCount());
        car.setDriver(driver.get());
            Car result = carRepository.save(car);
            ResponseCarInfo responseCar = ResponseCarInfo.newBuilder()
                    .setColor(result.getColor())
                    .setFuelType(result.getFuelType())
                    .setSeatsCount(result.getSeatsCount())
                    .setPlateNumber(result.getPlateNumber())
                    .setModel(result.getModel())
                    .build();
            responseCarInfo.onNext(responseCar);
            responseCarInfo.onCompleted();
    }
}

