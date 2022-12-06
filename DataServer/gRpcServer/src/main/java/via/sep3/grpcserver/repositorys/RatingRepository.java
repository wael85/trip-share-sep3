package via.sep3.grpcserver.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import via.sep3.grpcserver.Entities.Rating;

import java.util.List;
import java.util.Optional;

@Repository
public interface RatingRepository  extends JpaRepository<Rating,Long> {
    List<Rating> findByWriter_Email (String email);
    List<Rating> findBySubject_Email (String email);
    Optional<Rating> findById (long id);
}
