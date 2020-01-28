package cmr.mapper;

import org.mapstruct.Mapper;

import cmr.model.Customer;
import cmr.model.CustomerDto;
@Mapper
public interface CustomerDTOImpl {

	public Customer customerDtoToCustomer(CustomerDto dto);
	public CustomerDto customerToCustomerDto(Customer customer);
	
}
