package dk.tec.TodoListAPI.Controller;

import dk.tec.TodoListAPI.Model.TodoItem;
import dk.tec.TodoListAPI.Repo.TodoItemRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/todoitem")
public class TodoItemController {

    TodoItemRepository repository;

    TodoItemController(TodoItemRepository repository){
        this.repository = repository;
    }

    /*@PostMapping()
    public void create(@RequestBody TodoItem todoItem){
        repository.save(todoItem);
    } */

   @PostMapping("/create")
    public ResponseEntity<String> createTodoItem(@RequestBody TodoItem todoItem) {
        try {
            TodoItem savedTodoItem = repository.save(todoItem);
            return new ResponseEntity<>("TodoItem created successfully with ID: " + savedTodoItem.getId(), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("Failed to create TodoItem: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }



    @GetMapping("/{id}")
    TodoItem read(@PathVariable int id){
        return repository.findById(id).get();
    }

    @GetMapping()
    List<TodoItem> getAll(){
        return repository.findAll();
    }

    @PutMapping()
    void update(@RequestBody TodoItem todoItem){
        repository.save(todoItem);
    }

    @DeleteMapping("/{id}")
    void delete(@PathVariable int id) {
        repository.deleteById(id);
    }


}
