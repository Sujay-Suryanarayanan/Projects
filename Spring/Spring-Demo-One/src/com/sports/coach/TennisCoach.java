package com.sports.coach;

import com.sports.services.*;

public class TennisCoach implements Coach {
	private FortuneService fr;

	public TennisCoach(FortuneService fr_srvc) {
		fr = fr_srvc;
	}

	@Override
	public String getDailyWorkout() {
		return "Hi there , I am your Tennis Coach: Today you are scheduled to practice: Serve and backhand alignment!!";
	}

	@Override
	public String getDailyFourtune() {
		return fr.getFortuneService();
	}


}
