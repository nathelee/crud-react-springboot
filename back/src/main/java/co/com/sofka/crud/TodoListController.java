package co.com.sofka.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class TodoListController {

    @Autowired
    private TodoListService service;

    @GetMapping(value = "api/todoslist")
    public Iterable<TodoList> list(){
        return service.list();
    }

    @PostMapping(value = "api/todolist")
    public TodoList save(@RequestBody TodoList todo){
        return service.save(todo);
    }

    @PutMapping(value = "api/todolist")
    public TodoList update(@RequestBody TodoList todo){
        if(todo.getId() != null){
            return service.save(todo);
        }
        throw new RuntimeException("No existe el id para actualizar");
    }

    @DeleteMapping(value = "api/{id}/todolist")
    public void delete(@PathVariable("id")Long id){
        service.delete(id);
    }

    @GetMapping(value = "api/{id}/todolist")
    public TodoList get(@PathVariable("id") Long id){
        return service.get(id);
    }

}
