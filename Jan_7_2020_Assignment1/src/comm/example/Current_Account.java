package comm.example;

public class Current_Account extends Saving_Account
{
    private boolean yesEligible;
    private Float amount;
    public boolean equals()
    {
    	if(amount < 5000)
    	{
    		System.out.println("can not open");
    	}
    	
    	else
    		return yesEligible;
		return yesEligible;
    }
    
}
