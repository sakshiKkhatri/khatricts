package comm.example;

import java.time.LocalDate;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Account1 {
	private String accountNumber;
	private AccountType accountType;
	private double amount;
	private LocalDate dateOfOpening;
	private static Account1 account;
	
	static
	{
		account=new Account1();
	}
	
	public static Account1 createAccount(AccountType accountType, double amount)
	{
	 account.setAccountNumber(UUID.randomUUID().toString());
	 account.setAccountType(accountType);
	 account.setAmount(amount);
	 account.setDateOfOpening(LocalDate.now());
	 return account;
	 
	}

}
public String displayAccount()
return "Account Number"+getAccountNumber()+"AccountType"+getAccountType()+"amount"+getAmount()+"Opening Date:"+getOpeningDate();
}
}