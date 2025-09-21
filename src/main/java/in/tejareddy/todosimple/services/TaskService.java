package in.tejareddy.todosimple.services;

import in.tejareddy.todosimple.models.Task;
import in.tejareddy.todosimple.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTasks(){
        return taskRepository.findAll();
    }

    public void createTask(String title) {
        Task task = new Task();
        task.setTitle(title);
        task.setCompleted(false);
        taskRepository.save(task);
    }

    public void deletetask(long id) {
        taskRepository.deleteById(id);

    }

    public void toggletask(long id) {
        Task task = taskRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid task id:"));
        task.setCompleted(!task.isCompleted());
        taskRepository.save(task);


    }
}
