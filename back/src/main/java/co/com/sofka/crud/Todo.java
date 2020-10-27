package co.com.sofka.crud;

import javax.persistence.*;
import java.util.List;

@Entity
public class Todo {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private boolean completed;
    private String groupListId;


    //TodoList
    @OneToMany(mappedBy = "todo")
    private List<TodoList> todoList;

    public String getGroupListId() {
        return groupListId;
    }

    public void setGroupListId(String groupListId) {
        this.groupListId = groupListId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
