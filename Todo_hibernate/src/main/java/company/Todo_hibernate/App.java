package company.Todo_hibernate;


import java.time.LocalDateTime;
//import java.util.List;
import java.util.UUID;

//import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;




public class App 
{
    public static void main( String[] args )
    
    {
    	SessionFactory factory=null;
    	Session session=null;
       try {
    	   factory=new Configuration().configure().addAnnotatedClass(Todo.class)
    			   .buildSessionFactory();
    	   session=factory.openSession();
			
			  Todo todo=new Todo(); 
			  String str[]=UUID.randomUUID().toString().split("-");
			  todo.setUid(str[0]);
			  todo.setCreatingDateTime(LocalDateTime.now()); 
			  todo.setTodo_Name("Doe");
			  session.getTransaction().begin();
			  session.save(todo);
			  session.getTransaction().commit(); 
			  System.out.println(todo);
			 
			/*
			 * Query q= session.createQuery("from Todo"); List<Todo> l=q.list(); for(Todo
			 * p:l) { System.out.println(p); }
			 */
	} catch (Exception e) {
		e.printStackTrace();
	}
       finally {
		session.close();
		factory.close();
	}
    }
}