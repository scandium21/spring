package com.siliangchang.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// load the spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		// retrieve the bean from spring container
		CricketCoach myCricketCoach = context.getBean("myCricketCoach", CricketCoach.class);
		// call methods on the bean
		System.out.println(myCricketCoach.getDailyWorkout());
		System.out.println(myCricketCoach.getDailyFortune());
		
		// call new methods to get literal values
		System.out.println(myCricketCoach.getEmailAddress());
		System.out.println(myCricketCoach.getTeam());

		// close the context
		context.close();
	}

}
