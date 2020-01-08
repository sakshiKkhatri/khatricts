package comm.example;

public class Employee { 
 
	private int employeeId;
   private String employeeName;
   private String employeeAddress;
   private double employeeExperiance ;
   private Employee employee = null;
public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public String getEmployeeAddress() {
	return employeeAddress;
}
public void setEmployeeAddress(String employeeAddress) {
	this.employeeAddress = employeeAddress;
}
public double getEmployeeExperiance() {
	return employeeExperiance;
}
public void setEmployeeExperiance(double employeeExperiance) {
	this.employeeExperiance = employeeExperiance;
}
public Employee(int employeeId, String employeeName, String employeeAddress, double employeeExperiance) {
	super();
	this.employeeId = employeeId;
	this.employeeName = employeeName;
	this.employeeAddress = employeeAddress;
	this.employeeExperiance = employeeExperiance;
}
public Employee createEmployee(int employeeId, double employeeExperiance)throws EmployeeNotCreatedException
{
	
	employee=new Employee(employeeId,  employeeName,employeeAddress,employeeExperiance);
	if (employee.getEmployeeExperiance()<2)
	{
		throw new EmployeeNotCreatedException(" less than 2");
	}
	return employee;
}

public Employee()
{
	super();
}
@Override
public String toString() {
	return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeAddress="
			+ employeeAddress + ", employeeExperiance=" + employeeExperiance + "]";
}
   



}