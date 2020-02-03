package com.siliangchang.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		// load spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		// get the bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		// call dependency method on the bean
		System.out.println(theCoach.getDailyFortune());
		// close the context
		context.close();
	}

}
