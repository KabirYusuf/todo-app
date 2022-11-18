package todoApp.data.models;

import lombok.Data;


@Data
public class Todo {
    private TaskStatus taskStatus;
    private  Category category;
    private String title;
    private String content;
    private  String date;
    private  String time;
}
