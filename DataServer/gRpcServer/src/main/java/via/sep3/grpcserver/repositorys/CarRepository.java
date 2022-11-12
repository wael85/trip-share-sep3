package via.sep3.grpcserver.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import via.sep3.grpcserver.Entities.Car;

@Repository
public interface CarRepository extends JpaRepository<Car,Integer> {

}
