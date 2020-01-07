package comm.example;
public class Flyer
{
	private boolean canFly;
	 
	public Flyer()
	{
		super();
	}
public Flyer( boolean canFly) 
{
      this.setCanFly(canFly);
}
 public void takeOff()
 {
	 System.out.println(" Flyer Take off");
 }
public void fly()
{
System.out.print(" flyer fly");

}

public void land()
{
 System.out.println("flyer land");
}
public boolean isCanFly() {
	return canFly;
}
public void setCanFly(boolean canFly) {
	this.canFly = canFly;
}
}