package comm.mycompany.CustomerDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import comm.mycompany.CustomerDemo.name.Coach;

public class App 
{
    public static void main( String[] args )
    {
       try {
    	   ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
    	   Coach theCoach=context.getBean("theCoach",Coach.class);
    	   System.out.println(theCoach.getDailyWorkOut());
    	   System.out.println(theCoach.getDailyFortune());
		
	} catch (Exception e) {
		
	}
    }
}