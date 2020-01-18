package comm.mycompany.jan_18_2020_2;

import java.sql.SQLException;
import java.util.List;

public interface CustomerDao {

	public Customer createCustomer(Customer customer) throws SQLException;

	public List<Customer> displayCustomer();



	public Customer findById(String id);

	public Customer createCustomer(String firstname, String lastname, String email, String uid);
}
