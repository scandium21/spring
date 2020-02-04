package com.siliangchang.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach {

	@Autowired
	@Qualifier("fileFortuneService")
	private FortuneService fortuneService;
	
	// default constructor
	public BasketballCoach() {
		System.out.println(">> BasketballCoach: inside default constructor");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Dribble with left hand for 30 min";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
