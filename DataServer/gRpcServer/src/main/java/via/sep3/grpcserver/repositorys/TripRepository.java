package via.sep3.grpcserver.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import via.sep3.grpcserver.Entities.Trip;

import java.util.List;
import java.util.Optional;

@Repository
public interface TripRepository extends JpaRepository<Trip,Long> {
    @Query(value = "select *" +
            " from trip_share.trip " +
            "where driver_id= ?1",nativeQuery = true)
    Optional<List<Trip>> GetUsersTripsByUserId(String email);

    @Override
    List<Trip> findAll();
}
