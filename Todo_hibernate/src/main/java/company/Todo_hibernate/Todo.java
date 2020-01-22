package company.Todo_hibernate;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
@Entity
@Data
public class Todo {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private int todo_Id;
	private String uid;
	private String todo_Name;
	private LocalDateTime creatingDateTime;
	
}
