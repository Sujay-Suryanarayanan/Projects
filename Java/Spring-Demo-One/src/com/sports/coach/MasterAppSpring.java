package com.sports.coach;


public class MasterAppSpring {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach tr = context.getBean("track", Coach.class);// Retrieve bean from the spring container
		Coach bb = context.getBean("baseBall", Coach.class);
		Coach te = context.getBean("tennis", Coach.class);
		Coach sc = context.getBean("soccker", Coach.class);
		CricketCoach cr = context.getBean("cricket", CricketCoach.class);
		
		System.out.println(tr.getDailyWorkout() + tr.getDailyFourtune() + "\n" + bb.getDailyWorkout()
				+ bb.getDailyFourtune() + "\n" + te.getDailyWorkout() + te.getDailyFourtune() + "\n"
				+ cr.getDailyWorkout() + cr.getDailyFourtune() + "\n The cricket team name is: " + cr.getTeamName()
				+ " The cricket Team email ID is: " + cr.getTeamEmailID() + " The cricket Team Owner is : " + cr.getTeamOwner() + "\n"+ sc.getDailyWorkout()
				+ " "+sc.getDailyFourtune());// call methods on the bean
		context.close();// close the context
	}

}
