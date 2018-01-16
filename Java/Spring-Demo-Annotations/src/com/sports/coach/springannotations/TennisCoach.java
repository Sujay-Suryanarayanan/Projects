package com.sports.coach.springannotations;

import org.springframework.stereotype.Component;

//@Component("thatSillyCoach")

@Component
public class TennisCoach implements Coach {

	@Override
	public String getDailyworkout() {
		return "Practice backhand volley";
	}

	@Override
	public String getWarmupExerciseList() {
		// TODO Auto-generated method stub
		return null;
	}

}
