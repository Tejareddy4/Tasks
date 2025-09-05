package in.tejareddy.todosimple.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import in.tejareddy.todosimple.models.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {



}
