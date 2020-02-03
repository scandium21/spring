package com.siliangchang.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);

		// check if they are the same beans
		boolean result = (theCoach == alphaCoach);
		
		// print out result
		System.out.println("\nPointing to the same object: " + result);
		// will call toString() on theCoach, the default toString will return classname + memory address
		System.out.println("\nMemory location for theCoach: " + theCoach);
		System.out.println("\nMemory location for alphaCoach: " + alphaCoach + "\n");
		// Pointing to the same object: false
		// Memory location for theCoach: com.siliangchang.springdemo.TrackCoach@6f27a732
		// Memory location for alphaCoach: com.siliangchang.springdemo.TrackCoach@6c779568
		
		// close context
		context.close();
	}

}
