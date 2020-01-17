package comm.mycompany.CustomerDemo.name;

public class BaseBallCoach implements Coach {
	FortuneService fortuneService=null;
	

	public BaseBallCoach(comm.mycompany.CustomerDemo.name.FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		
		return "practice backball volley today";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getDailyFortune();
	}

}