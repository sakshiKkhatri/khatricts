package collection;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode



public class Student implements Comparable<Student> {
	
	String first_Name;
	String last_Name;
	String student_Id;
	double GP;
	@Override
	public int compareTo(Student student) {
		int result = 0;
		if(this.getGP()> student.getGP())
		{
			result = 1;
		}
		
		if(this.getGP()< student.getGP())
		{
			result = -1;
		}
		
		if(this.getGP()==student.getGP())
		{
			result =0;
		}
		
		
		return result;
	

	
	
	
	
	}

	
	
	
	

}
