package comm.mycompany.jan_18_2020_2;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor

public class Service {
CustomerDao custdao;
public Customer createCustomer(String firstname, String lastname, String email, String uid)
{
	return custdao.createCustomer(firstname, lastname, email, uid);
}
public List<Customer> displayCustomer()
{
		return custdao.displayCustomer();
}
public Customer findById(String id)
{
	
	return custdao.findById(id);	
} 
}