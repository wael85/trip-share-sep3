package via.sep3.grpcserver.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import via.sep3.grpcserver.Entities.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location,Long> {
}