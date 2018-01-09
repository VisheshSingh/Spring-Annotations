package com.springAnnotations;

import org.springframework.stereotype.Component;

@Component("mrJordanTheGreat")
public class BasketballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Dribbling and 3-pointer practice in the morning";
	}

}
