package com.siliangchang.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Practice3 {
	// 1. Add bean scopes to your new Coach implementation that you created in one of the 
	//    previous activities.
    // 2. Test singleton scope and prototype scope as I did in the videos.
	// 3. Verify that the bean scopes are being applied as desired.

	public static void main(String[] args) {
		// load spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("practice3-application.xml");
		// get the bean from container
		Coach theCoach = context.getBean("myCoach", Coach.class);

		// call a method on the bean
		System.out.println(theCoach.getDailyFortune());
		// close context
		context.close();
	}

}
