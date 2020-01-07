package comm.example;
import java.util.Scanner;
import comm.example.Account;
import comm.example.AccountType;
public class Tester
{
private static Scanner scanner=newScanner(System.in);
public static void main(String[] args) 
{
		int choice==1;
 Account account=null;
 do {
	 
	 System.out.println("1.create acount");
	 System.out.println("2.display ammount");
	 System.out.println("0. exit");
	 System.out.printl("choose yourchoice");
	 choice= sccaner.nextInt();
	 switch(choice)
	 {
	 case1: ()
		 account=Account.createAccount(AccountType.CREDIT_CARD,1000);
	 break;
	 case 2:
		 System.out.println(account.displaccount());
		 break;
	 case0:
		 
		 System.out.println("existing from system");
		 System.exit(0);
		 default:
			 System.out.println("invalid choice");
			 break;
	 }
 }
 while(choice !=);
}
}
	 
 }
 
	}

}
