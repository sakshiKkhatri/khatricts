package cmr.model.dao;

import java.util.List;

import cmr.model.Customer;

public interface CustomerDAO {

	public Customer createCustomer(Customer customer);
	public List<Customer> getAllCustomer();
}