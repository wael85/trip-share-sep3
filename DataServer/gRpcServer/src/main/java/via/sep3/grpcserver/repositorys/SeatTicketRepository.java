package via.sep3.grpcserver.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import via.sep3.grpcserver.Entities.SeatTicket;
@Repository
public interface SeatTicketRepository extends JpaRepository<SeatTicket,Long> {
}
