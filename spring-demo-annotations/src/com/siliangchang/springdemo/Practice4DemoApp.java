package com.siliangchang.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Practice4DemoApp {

	public static void main(String[] args) {
		// load spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		// get the bean
		Coach theCoach = context.getBean("practiceCoach", Coach.class);
		// call method on bean
		System.out.println(theCoach.getDailyWorkout());
		// close context
		context.close();
	}

}
