package comm.example;

public class Test {

	public static void main(String[] args) throws EmployeeNotCreatedException
	{
		Employee employee= new Employee();
		employee.createEmployee(22, 1);
		System.out.println(employee);
		
	}
	
	
}
