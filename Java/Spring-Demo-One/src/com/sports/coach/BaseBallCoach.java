package com.sports.coach;

import com.sports.services.*;

public class BaseBallCoach implements Coach {
	// define a private field for the dependency
	private FortuneService fr;

	// define a constructor for dependency injection
	public BaseBallCoach(FortuneService fr_srvc) {
		fr = fr_srvc;
	}

	public String getDailyWorkout() {
		return "Hi there , I am your BaseBall Coach: Today you are scheduled to practice: Hit a homerun!";
	}

	@Override
	public String getDailyFourtune() {
		return fr.getFortuneService();
	}
}
