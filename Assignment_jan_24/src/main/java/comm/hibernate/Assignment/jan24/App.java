package comm.hibernate.Assignment.jan24;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import comm.hibernate.Assignment.jan24.Entity.Comment;
import comm.hibernate.Assignment.jan24.Entity.Post;


public class App 
{
    
	public static void main( String[] args )
    {
      try {
    	  
    	  ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
    	  PostService service=context.getBean("service", PostService.class);
    	  Comment comment = new Comment("Khatri", LocalDateTime.now());
    	  String str[]=UUID.randomUUID().toString().split("-");
    	  Post post = new Post(str[0], "khatri", "www.khatri.com", LocalDateTime.now());
    	  post.setComment(comment);
    	  service.createPost(post);
    	  System.out.println(post);
    	  
  
		
	} catch (Exception e) {
		e.printStackTrace();
	}
      finally{
    	  
      }
    }
}
