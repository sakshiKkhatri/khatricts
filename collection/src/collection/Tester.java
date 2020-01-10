package collection;

import java.util.TreeSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;

public class Tester 

   {

	public static void main(String[] agrs)
	{
		
		Set<Student> set= new TreeSet<Student>();
		set.add(new Student("sakshi","khatri", UUID.randomUUID().toString(),9.9));
		set.add(new Student("shivani","bhimani", UUID.randomUUID().toString(),5.5));
		  
		Iterator<Student> l= set.iterator();
		while(l.hasNext())
		{
			System.out.println(l.next()+"\n");
		}
	
	
	}
	
	


   
   }
