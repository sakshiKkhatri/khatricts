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
public class Account {
	private  String accountNumber;
	private AccountType accountType;
	private double amount;
	private LocalDate dateOfOpening;
	private static Account account;

	static {
		account = new Account();
	}

	public static Account createAccount(AccountType accountType, double amount) {
		account.setAccountNumber(UUID.randomUUID().toString());
		account.setAccountType(accountType);
		account.setAmount(amount);
		account.setDateOfOpening(LocalDate.now());
		return account;

	}

	public String displayAccount()

	{
		return "Account Number" + getAccountNumber() + "Account Type" + getAccountType() + "amount" + getAmount()
				+ "OpeningDate" + getDateOfOpening();
	}
}
