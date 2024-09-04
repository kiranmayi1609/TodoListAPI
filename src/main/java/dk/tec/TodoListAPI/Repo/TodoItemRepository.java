package dk.tec.TodoListAPI.Repo;

import dk.tec.TodoListAPI.Model.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoItemRepository extends JpaRepository<TodoItem, Integer> {
}

