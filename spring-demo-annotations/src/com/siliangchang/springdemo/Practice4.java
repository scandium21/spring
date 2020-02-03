package com.siliangchang.springdemo;

import org.springframework.stereotype.Component;

@Component("practiceCoach")
public class Practice4 implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Do hiit for 1 hr";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
