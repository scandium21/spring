package com.siliangchang.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Practice7DemoApp {

	public static void main(String[] args) {
		// read spring java config class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(Practice7Config.class);
		// retrieve bean
		Coach theCoach = context.getBean("practice7Coach", Coach.class);
		// call bean method
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getDailyWorkout());
		// close context
		context.close();
	}

}
