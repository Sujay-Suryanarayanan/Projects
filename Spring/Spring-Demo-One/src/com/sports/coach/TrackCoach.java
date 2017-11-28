package com.sports.coach;

import com.sports.services.*;

public class TrackCoach implements Coach {
	private FortuneService fr;

	public TrackCoach(FortuneService fr_srvc) {
		fr = fr_srvc;
	}

	@Override
	public String getDailyWorkout() {
		return "Hi there , I am your Athletics and Track Training Coach: Today you are scheduled to :Run a 5k Marathon!!";
	}

	@Override
	public String getDailyFourtune() {
		return fr.getFortuneService();
	}

}
