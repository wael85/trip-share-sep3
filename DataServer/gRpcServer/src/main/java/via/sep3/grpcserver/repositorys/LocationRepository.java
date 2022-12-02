package via.sep3.grpcserver.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import via.sep3.grpcserver.Entities.Location;

import java.util.List;
import java.util.Optional;

@Repository
public interface LocationRepository extends JpaRepository<Location,Long> {

    @Query(value ="select * " +
            "from trip_share.location where trip_id=?1",nativeQuery = true )
    Optional<List<Location>>  getAllByTripId(long tripId);
}
