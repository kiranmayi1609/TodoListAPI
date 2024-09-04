package dk.tec.TodoListAPI;

import dk.tec.TodoListAPI.Model.TodoItem;
import dk.tec.TodoListAPI.Repo.TodoItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;

@SpringBootApplication
public class TodoListApiApplication implements CommandLineRunner {

	@Autowired
	private TodoItemRepository todoItemRepository;

	public static void main(String[] args) {

		SpringApplication.run(TodoListApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		TodoItem todoItem = new TodoItem();

		todoItem.setName("Test Task");
		todoItem.setName("Test Task");
		todoItem.setDescription("This is a test task");
		todoItem.setPlannedStartTime(LocalDateTime.now());
		todoItem.setPlannedEndTime(LocalDateTime.now().plusHours(1));
		todoItem.setXp(100);
		todoItemRepository.save(todoItem);
	}


}
