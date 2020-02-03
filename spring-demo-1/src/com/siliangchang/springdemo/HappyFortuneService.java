package com.siliangchang.springdemo;

import java.util.Random; 

public class HappyFortuneService implements FortuneService {
	
	private String[] fortuneLines = {"today is your lucky day", "you're going lucky lucky", "lucky is your name"};	
	
	@Override
	public String getFortune() {
		Random rand = new Random();
		int randNum = rand.nextInt(fortuneLines.length);
		return fortuneLines[randNum];
	}

}
