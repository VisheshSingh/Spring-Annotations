package com.springAnnotations;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	// Reference values from Properties file
	@Value("${foo.email}")
	public String email;

	@Value("${foo.team}")
	public String team;

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

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

}
