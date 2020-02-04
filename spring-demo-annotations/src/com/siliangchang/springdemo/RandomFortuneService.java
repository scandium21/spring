package com.siliangchang.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	// create and array of strings
	private String[] data = {
			"Beware of the wolf in sheep's clothing",
			"Diligence is the mother of good luck",
			"The journey is the reward"
	};
	
	private Random myRand = new Random();
	
	@Override
	public String getFortune() {
		// pick a random string from the array
		return data[myRand.nextInt(data.length)];
	}

}
