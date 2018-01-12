package com.springAnnotations;

public class SwimCoach implements Coach {

	private FortuneService fs;

	public SwimCoach(FortuneService fs) {
		this.fs = fs;
	}

	@Override
	public String getDailyWorkout() {
		return "Stretching and basic strokes";
	}

	@Override
	public String getDailyFortune() {
		return fs.getFortune();
	}

}
