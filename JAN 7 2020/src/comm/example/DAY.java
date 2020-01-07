package comm.example;

public enum DAY {
	SUN("Today is Holiday",1),
	MON("Today is Monday",2),
	TUE("Today is Tuesday",3),
	WED("Today is Wednsdau",4),
	FRI("Today is Friday",6),
	SAT("Today is Saturday",7);
	
	private final String name;
	private final int number;
	private DAY( String n, int r)
	{
		name  = n;
		number=r;
		
	}
	

public String getName()
{
 return name;	
}
 
public int getNumber()
{
return number;
}

}
