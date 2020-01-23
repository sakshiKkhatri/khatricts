package comm.hibernate.spring.hibernate.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import lombok.Data;

import org.hibernate.validator.constraints.Length;


@Data
@Entity
public class UserDetail {
	@Id
	@GeneratedValue( strategy =  GenerationType.IDENTITY)
	private Integer id;
	private String userId;
    @Length(min = 8, max = 15, message = "invalid username")
	private String userName;
	@Email(message = "invalid email")
	private String email;
	
}
