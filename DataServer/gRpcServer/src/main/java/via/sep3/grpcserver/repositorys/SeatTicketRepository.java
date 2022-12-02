package via.sep3.grpcserver.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import via.sep3.grpcserver.Entities.SeatTicket;
import via.sep3.grpcserver.Entities.User;

import java.util.List;
import java.util.Optional;

@Repository
public interface SeatTicketRepository extends JpaRepository<SeatTicket,Long> {

    List<SeatTicket>getSeatTicketsByPassenger(User P);
}
