package demo.springboot.multidb.dao.secondary;

import demo.springboot.multidb.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public  class UserRepositoryTest {
    @Autowired
    @Qualifier("secondUserRepository")
    private UserRepository userRepository;
    @Test
    public void save(){
        User user = new User();
        user.setName("secondary");
        userRepository.save(user);
    }
}