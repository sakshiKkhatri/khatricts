package comm.example;

import java.util.List;

public interface ToDoService {
	public ToDo createToDo(String toDoName , String author, String taskname);
	public List<ToDo> getAllToDos();
	public ToDo findById(String toDoId);
	public void deleteToDo(String toDoId);
	public void removeAllToDo();
}