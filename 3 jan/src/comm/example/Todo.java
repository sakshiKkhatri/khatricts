package comm.example;
import java.time.LocalDate;
import java.util.UUID;
import java.time.LocalDate;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Todo {
private Task task;
private String todoId;
private LocalDate date;
private boolean isCompleted;

public Todo(Task task) {
	
	this.task = task;
}
public Todo createTodo(String author,String taskName,boolean isCompleted)
{
	
	task=new Task();
   Todo todo= new Todo();
   System.out.println("creating a new task");
  task= task.createTask(author,taskName);
	System.out.println("Sucessfully created task\ncreating new todo..");
	todo.setTodoId(UUID.randomUUID().toString());
	todo.setDate(LocalDate.now());
	todo.setCompleted(isCompleted);
    todo.setTask(task);
    return todo;
}


public String getTodoDetails()
{
	return task.getTaskDetails()+" todo id: "+getTodoId()+
			" todo date: "+getDate()+" completed: "+isCompleted;
}

}