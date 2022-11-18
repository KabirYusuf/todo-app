package todoApp.data.repositories;

import org.junit.jupiter.api.*;
import todoApp.data.models.User;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;


class UserRepoImplTest {
    private UserRepo userRepo;
    private User user;
    private User user1;

    @BeforeEach
    void setUp() {
        userRepo = new UserRepoImpl();
        user = new User();
        user.setUserName("kaybee");
        user.setEmail("kaybee@gmail.com");
        user.setPassword("1234567");

        user1 = new User();
        user1.setUserName("jerry");
        user1.setEmail("jerry@gmail.com");
        user1.setPassword("34567");
    }

    @Test
    void save() {
        try {
            userRepo.save(user);
            userRepo.save(user1);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        assertEquals(1, user.getId());
//        assertEquals(2, user1.getId());
    }

    @Test
    void deleteByEmail() {
    }

    @Test
    void deleteById() {
    }

    @Test
    void searchById() {
    }

    @Test
    void searchByEmail() {
    }
}