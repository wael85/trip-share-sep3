package via.sep3.grpcserver.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import via.sep3.grpcserver.Entities.Login;
import via.sep3.grpcserver.Entities.User;

import java.util.Optional;
@Repository
public interface LoginRepository extends JpaRepository<Login,Long> {
    @Query(value = """
            select *
            from trip_share.login
            where user_id=?1""",nativeQuery = true )
    Optional<Login> getLoginByUserId(String email);
}
