package co.com.sofka.crud;

import javax.persistence.*;

@Entity
@Table(name = "todolist")
public class TodoList {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer idTodo;
    private String name;
    private boolean completed;
    private String groupListId;

    @ManyToOne
    @JoinColumn(name = "idTodo", insertable = false, updatable = false)
    private Todo todo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdTodo() {
        return idTodo;
    }

    public void setIdTodo(Integer idTodo) {
        this.idTodo = idTodo;
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

    public String getGroupListId() {
        return groupListId;
    }

    public void setGroupListId(String groupListId) {
        this.groupListId = groupListId;
    }


}
