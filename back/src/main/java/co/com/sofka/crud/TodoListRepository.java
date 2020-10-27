package co.com.sofka.crud;

import org.springframework.data.repository.CrudRepository;

public interface TodoListRepository extends CrudRepository <TodoList, Integer> {
}
