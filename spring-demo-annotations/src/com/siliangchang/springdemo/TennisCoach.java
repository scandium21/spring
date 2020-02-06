package com.siliangchang.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService") // default bean ID: classname with lowercase first letter 
	private FortuneService fortuneService;
	
	// default constructor
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor");
	}
	
	// define my init method
	// code will execute after constructor and after injection of dependencies
	@PostConstruct
	public void doStartUpStuff() {
		System.out.println(">> TennicCoach: inside of doStartUpStuff");
	}
	
	// define my destroy method
	@PreDestroy
	public void doCleanUpStuff() {
		System.out.println(">> TennicCoach: inside of doCleanUpStuff");
	}
	
	/* @Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	} */
	
	// setter
	// can use any name for the method, doesn't have to be setFortuneService
	// as long as @Autowired is annotated
	/*@Autowired
	public void doSomeCrazyStuff(FortuneService fortuneService) {
		System.out.println(">> TennisCoach: inside doSomeCrazyStuff() method");
		this.fortuneService = fortuneService;
	}*/
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
