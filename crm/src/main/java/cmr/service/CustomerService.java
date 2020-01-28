package cmr.service;

import java.util.List;

import cmr.model.Customer;

public interface CustomerService {
	public Customer createCustomer(Customer customer);
	public List<Customer> getAllCustomer();
  
}