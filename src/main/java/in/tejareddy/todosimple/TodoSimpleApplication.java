package in.tejareddy.todosimple;

import in.tejareddy.todosimple.controller.TaskController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

public class TodoSimpleApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoSimpleApplication.class, args);
	}

}
