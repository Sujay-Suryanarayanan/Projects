package com.sports.coach;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeMasterAppSpring {

	public static void main(String[] args) {

		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext2.xml");
		Coach theCoach = context.getBean("myCoach",Coach.class);
		Coach alphaCoach = context.getBean("myCoach",Coach.class);
		Coach tennisCoach = context.getBean("tennis",Coach.class);
		Coach alphatennisCoach = context.getBean("tennis",Coach.class);
		//Retrieve bean from spring container
		//Check Result
		boolean result = (theCoach==alphaCoach);
		System.out.println("Pointing to the same object :" + result);
		System.out.println("Memory Location of theCoach object is" + theCoach);
		System.out.println("Memory Location of alphaCoach object is" + alphaCoach);
		
		boolean result1 = (tennisCoach==alphatennisCoach);
		System.out.println("\nPointing to the same object :" + result1);
		System.out.println("Memory Location of tennisCoach object is" + tennisCoach);
		System.out.println("Memory Location of alphatennisCoach object is" + alphatennisCoach);
		
		context.close();
		
		
		
	}

}
