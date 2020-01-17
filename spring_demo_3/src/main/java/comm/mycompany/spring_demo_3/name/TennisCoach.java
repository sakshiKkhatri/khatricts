package comm.mycompany.spring_demo_3.name;

public class TennisCoach {
	private String email;
	private int age;

	private FortuneService fortuneService;
	
	
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor");
	}

	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println(">> TennisCoach: inside setFortuneService() method");
		this.fortuneService = theFortuneService;
	}

	
	
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public int getAge() {
		return age;
	}
}
