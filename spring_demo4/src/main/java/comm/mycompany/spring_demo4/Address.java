package comm.mycompany.spring_demo4;

import java.util.UUID;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import comm.hibernate.spring_hibernate_demo.Entity.UserDetail;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Component("add")
public class Address {
	private String addressLine1;
	private String addressLine2;
	private String phoneNumber;
	private String zipCode;
	@Override
	public String toString() {
		return "Address [addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", phoneNumber="
				+ phoneNumber + ", zipCode=" + zipCode + "]";
	}
	
	

}




