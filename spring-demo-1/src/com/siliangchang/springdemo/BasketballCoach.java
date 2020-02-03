package com.siliangchang.springdemo;

public class BasketballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BasketballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	// init-method
	public void doWhenStartingUp() {
		System.out.println("In init-method of BasketballCoach: doWhenStartingUp");
	}
	
	// destroy-method
	public void doWhenClosingDown() {
		System.out.println("In destroy-method of BasketballCoach: doWhenClosingDown");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Dribble with left hand for 30min";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
