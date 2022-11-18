package todoApp.data.repositories;

import com.fasterxml.jackson.databind.ObjectMapper;
import todoApp.data.models.User;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserRepoImpl implements UserRepo{
    List<User> users = new ArrayList<>();
    ObjectMapper objectMapper = new ObjectMapper();
    @Override
    public User save(User user){
        users.clear();
        List<User>userList= readValueFromFile();
        users.addAll(userList);
        int id = users.size() + 1;
        user.setId(id);
        users.add(user);
        try {

            objectMapper.writeValue(Paths.get("users.json").toFile(), users);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return user;
    }

    @Override
    public void deleteByEmail(String email) {

    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public User searchById(int id) {
        return null;
    }

    @Override
    public User searchByEmail(String email) {
        return null;
    }

    private List<User> readValueFromFile(){
        List<User> readUsers;

        try {
            readUsers = Arrays.asList(objectMapper.readValue(Paths.get("users.json").toFile(), User[].class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return readUsers;
    }
}
