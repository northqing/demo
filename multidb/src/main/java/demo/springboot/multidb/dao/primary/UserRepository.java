package demo.springboot.multidb.dao.primary;

import demo.springboot.multidb.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("primaryUserRepository")
public interface UserRepository extends JpaRepository<User, String> {
}
