package com.sports.coach;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleMasterAppSpring {

	public static void main(String[] args) {

		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		Coach theCoach = context.getBean("track",Coach.class);
		System.out.println(theCoach.getDailyWorkout());
		//Retrieve bean from spring container

		context.close();
		
		
		
	}

}
