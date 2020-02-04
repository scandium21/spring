package com.siliangchang.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Practice5 {

	public static void main(String[] args) {
		// load spring config
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		// get bean
		Coach bCoach = context.getBean("basketballCoach",Coach.class);
		// call method
		System.out.println(bCoach.getDailyWorkout());
		System.out.println(bCoach.getDailyFortune());
		// close context
		context.close();
	}

}
