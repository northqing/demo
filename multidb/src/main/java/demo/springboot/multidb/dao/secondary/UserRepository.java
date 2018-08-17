package demo.springboot.multidb.dao.secondary;

import demo.springboot.multidb.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("secondUserRepository")
public interface UserRepository extends JpaRepository<User, String> {
}
