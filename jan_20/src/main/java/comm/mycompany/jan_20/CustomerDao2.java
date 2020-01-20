package comm.mycompany.jan_20;


import java.sql.SQLException;
import java.util.List;

import comm.mycompany.jan_20.Customer;

public interface CustomerDao2 {

	public Customer createCustomer(Customer customer) throws SQLException;
	public List<Customer> getAllCustomers()throws SQLException;
	public List<Customer> getCustomerById(String uId) throws SQLException;
	public List<Customer> updateCustomerById(Customer customer)throws SQLException;
	public List<Customer> deleteCustomer(String uId) throws SQLException;




}