package co.com.sofka.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoListService {

    @Autowired
    private TodoListRepository listRepository;

    public Iterable<TodoList> list(){
        return listRepository.findAll();
    }

    public TodoList save(TodoList todo){
        return listRepository.save(todo);
    }

    public void delete(Long id){
        listRepository.delete(get(id));
    }

    public TodoList get(Long id){
        return listRepository.findById(Math.toIntExact(id)).orElseThrow();
    }
}
