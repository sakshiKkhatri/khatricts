package comm.mycompany.jan_18_2020_2;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;


@Component
public class App 
{
	public static void main( String[] args )
    {
      try {
    	  ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
    	  CustomerDao dao=context.getBean("dao",CustomerDao.class);
    	  Customer c=dao.createCustomer(new Customer(UUID.randomUUID().toString(),"sakshi", "khatri", "khatri@email.com"));
    	  Customer c1=dao.createCustomer(new Customer(UUID.randomUUID().toString(),"shivani", "joshi", "khatri@email.com"));
    	  Customer c3=dao.createCustomer(new Customer(UUID.randomUUID().toString(),"sheru", "khatri", "khatri@email.com"));
    	  
    	  
    	  
    	  System.out.println(c+"\n"+"\n"+c3+"\n"+c1);
		
	} catch (Exception e) {
		e.printStackTrace();
	}
    }
}