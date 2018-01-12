package com.springAnnotations;

public class SoccerCoach implements Coach {

	private FortuneService fs;

	public SoccerCoach(FortuneService fs) {
		this.fs = fs;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice formations and passing";
	}

	@Override
	public String getDailyFortune() {
		return fs.getFortune();
	}

}
