package comm.example;

import lombok.AllArgsConstructor;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Get
@ToString
public class Address {
	private String addressLine1;
	private String addressLine2;
	private  int phoneNumber;

}