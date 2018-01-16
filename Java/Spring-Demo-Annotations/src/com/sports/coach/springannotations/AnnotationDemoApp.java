package com.sports.coach.springannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		//read the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean from the spring container
		Coach thecoach = context.getBean("tennisCoach",Coach.class);
		
		//call a method of the bean
		System.out.println(thecoach.getDailyworkout());
		
		//close the context
		context.close();
	}

}
