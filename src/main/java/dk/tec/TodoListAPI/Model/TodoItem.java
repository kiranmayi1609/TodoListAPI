package dk.tec.TodoListAPI.Model;


import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;


enum TypeTask {CLEANING, COOKING, YARDWORK, TELEVISION, PLANNING, COALMINING}
enum Priority {HIGH, NORMAL, LOW}
@Entity
public class TodoItem {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String imageBeforeFile;
    private String imageAfterFile;
    private String description;
    private LocalDateTime plannedStartTime;
    private LocalDateTime plannedEndTime;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private int ticksSpend;

    @Enumerated(EnumType.STRING)
    private TypeTask typeTask;

    @OneToMany(cascade = CascadeType.ALL)
    private List<TodoItem> todoItemsBlockersList;

    private Boolean isCompleted = false;
    private Boolean isRepeatable;
    private int xp;

    // Getter and Setter for 'id' with correct naming
    public int getId() {
        return id;  // Use 'id' here, not 'Id'
    }

    public void setId(int id) {
        this.id = id;  // Use 'id' here, not 'Id'
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageBeforeFile() {
        return imageBeforeFile;
    }

    public void setImageBeforeFile(String imageBeforeFile) {
        this.imageBeforeFile = imageBeforeFile;
    }

    public String getImageAfterFile() {
        return imageAfterFile;
    }

    public void setImageAfterFile(String imageAfterFile) {
        this.imageAfterFile = imageAfterFile;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getPlannedStartTime() {
        return plannedStartTime;
    }

    public void setPlannedStartTime(LocalDateTime plannedStartTime) {
        this.plannedStartTime = plannedStartTime;
    }

    public LocalDateTime getPlannedEndTime() {
        return plannedEndTime;
    }

    public void setPlannedEndTime(LocalDateTime plannedEndTime) {
        this.plannedEndTime = plannedEndTime;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public int getTicksSpend() {
        return ticksSpend;
    }

    public void setTicksSpend(int ticksSpend) {
        this.ticksSpend = ticksSpend;
    }

    public TypeTask getTypeTask() {
        return typeTask;
    }

    public void setTypeTask(TypeTask typeTask) {
        this.typeTask = typeTask;
    }

    public List<TodoItem> getTodoItemsBlockersList() {
        return todoItemsBlockersList;
    }

    public void setTodoItemsBlockersList(List<TodoItem> todoItemsBlockersList) {
        this.todoItemsBlockersList = todoItemsBlockersList;
    }

    public Boolean getCompleted() {
        return isCompleted;
    }

    public void setCompleted(Boolean completed) {
        isCompleted = completed;
    }

    public Boolean getRepeatable() {
        return isRepeatable;
    }

    public void setRepeatable(Boolean repeatable) {
        isRepeatable = repeatable;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }
}
