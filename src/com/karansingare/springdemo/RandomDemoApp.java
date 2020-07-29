package com.karansingare.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RandomDemoApp {

	public static void main(String[] args) {
		// load the configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		// retrieve the bean
		HockeyCoach theCoach = context.getBean("myHockeyCoach", HockeyCoach.class);
		
		// call the method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		// close the bean
		context.close();

	}

}
