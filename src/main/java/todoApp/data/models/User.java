package todoApp.data.models;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class User {
    private  int id;
    private String userName;
    private String email;
    private String password;
    List<Todo> todoList = new ArrayList<>();

}
