package com.sports.coach;

import com.sports.services.*;

public class CricketCoach implements Coach {
	private FortuneService fr;
	private String teamName;
	private String teamEmailID;
	private String teamOwner;
	public CricketCoach(FortuneService fr) {
		this.fr = fr;
	}

	public CricketCoach() {
		//default no-arg constructor
	}
	
	public void setFr(FortuneService fr) {
		// System.out.println("Inside setter method - setFortuneService");
		this.fr = fr;

	}
	
	@Override
	public String getDailyWorkout() {
		return "Hi there , I am your Cricket Coach: Today you are scheduled to :Fielding Practice ";
	}

	@Override
	public String getDailyFourtune() {
		return fr.getFortuneService();
	}
	
	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getTeamEmailID() {
		return teamEmailID;
	}

	public void setTeamEmailID(String teamEmailID) {
		this.teamEmailID = teamEmailID;
	}

	public String getTeamOwner() {
		return teamOwner;
	}

	public void setTeamOwner(String teamOwner) {
		this.teamOwner = teamOwner;
	}




}
