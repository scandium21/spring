package com.siliangchang.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		// load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// retrieve bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		// check if they are the same
		boolean result = (theCoach == alphaCoach);
		
		// print out
		System.out.println("\nPointing to the same object: " + result);
		System.out.println("\nMemory location for theCoach: " + theCoach);
		System.out.println("\nMemory location for alphaCoach: " + alphaCoach + "\n");
		// Pointing to the same object: false
		// Memory location for theCoach: com.siliangchang.springdemo.TennisCoach@1f9e9475
		// Memory location for alphaCoach: com.siliangchang.springdemo.TennisCoach@3aa078fd
		
		// close the context
		context.close();
	}

}
