package company.ToDo_one_to_one;

import company.ToDo_one_to_one.entity.Task;
import company.ToDo_one_to_one.entity.Todo;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class App 
{
	public static void main(String[] args) {
		try {
			
			SessionFactory factory=new Configuration()
					.configure().addAnnotatedClass(Todo.class)
					.addAnnotatedClass(Task.class).buildSessionFactory();
			Session session=factory.openSession();
			Todo todo=new Todo("Khatri", "12-05-2013");
			todo.setTask(new Task("draw", "Sakshi"));
			session.getTransaction().begin();
			session.save(todo);
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
