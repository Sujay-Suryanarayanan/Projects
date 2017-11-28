package com.sports.coach;

import com.sports.services.FortuneService;

public class SoccerCoach implements Coach {
	private FortuneService fr;

	
	public SoccerCoach(FortuneService fr_srvc) {
		fr = fr_srvc;
	}
	
	// create a setter method in this class for injection

	public FortuneService getFr() {
		return fr;
	}

	public void setFr(FortuneService fr) {
		// System.out.println("Inside setter method - setFortuneService");
		this.fr = fr;

	}

	@Override
	public String getDailyWorkout() {
		return "Hi there , I am your Soccer Coach: Today you are scheduled to practice: Goal Keeping, ";
	}

	@Override
	public String getDailyFourtune() {
		return "You would meet a friend who would last for a lifetime today" + fr.getFortuneService();
	}



}
