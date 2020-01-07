package comm.example;

import java.util.Random;
public class Rfs {
 
	private String fortune[] = { "DemoFortune1","Demo Fortune1","Demo Fortune1","Demo Fortune1"
  
};
public String getDailyFortune()
{
	Random random =new Random();
	
	return fortune [(int)Math.random()];

	return fortune[random.nextInt(5)];
}

}