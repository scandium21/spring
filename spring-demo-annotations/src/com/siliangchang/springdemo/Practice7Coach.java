package com.siliangchang.springdemo;

public class Practice7Coach implements Coach {

	private FortuneService fortuneService;
	
	public Practice7Coach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Write code for 30min";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
