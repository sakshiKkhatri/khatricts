package company.jan_20_2;
import java.sql.SQLException;
import java.util.List;



public interface CustomerDao {

	public Customer createCustomer(Customer customer) throws SQLException;
	public List<Customer> getAllCustomers()throws SQLException;
	public List<Customer> getCustomerById(String uId) throws SQLException;
	public List updateCustomerById(Customer customer)throws SQLException;
	public int deleteCustomer(String uId) throws SQLException;
	int updateCustomerById(String uId) throws SQLException;
}