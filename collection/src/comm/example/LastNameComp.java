
package comm.example;

import java.util.*;

public class LastNameComp implements Comparator<Student> {
	public int compare(Student o1, Student o2) {
		return (o1.getLastName().compareTo(o2.getLastName()));
	}
}