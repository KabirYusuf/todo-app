package todoApp.data.repositories;

import todoApp.data.models.User;

import java.io.IOException;

public interface UserRepo {
User save(User user) throws IOException;

void deleteByEmail(String email);

void deleteById(int id);

User searchById(int id);

User searchByEmail(String email);

}
