package via.sep3.grpcserver.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import via.sep3.grpcserver.Entities.Trip;
@Repository
public interface TripRepository extends JpaRepository<Trip,Long> {
}
