package via.sep3.grpcserver.repositorys;

import com.google.common.base.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import via.sep3.grpcserver.Entities.Notification;
import via.sep3.grpcserver.Entities.User;

import java.util.ArrayList;
@Repository
public interface NotificationRepository extends JpaRepository<Notification,Integer> {
    ArrayList<Notification> findAllByConsumerAndConsumedIsFalse(User user);
    Optional<Notification> getById(int id);
}
