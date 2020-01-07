package comm.example;

public class Saving_Account extends Account
{
public Saving_Account(Integer accountId, String accountName, String address) {
		super(accountId, accountName, address);
		// TODO Auto-generated constructor stub
	}

private Float rateofInterest;
private Float amount;

public String toString()
{
	return"Saving_Account [rateOfInterest="+ rateofInterest +",amount="+amount+"]";
}

}
