package company.jan_20_2;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CustomerRowMapper implements RowMapper {

	@Override
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Customer customer=new Customer();
		customer.setUid(rs.getString("uid"));
		customer.setFirstName(rs.getString("first_name"));
		customer.setLastName(rs.getString("last_name"));
		customer.setEmail(rs.getString("email"));
		return customer;
	}

}