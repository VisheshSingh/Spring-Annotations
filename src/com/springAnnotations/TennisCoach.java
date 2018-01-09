package com.springAnnotations;

import org.springframework.stereotype.Component;

//@Component("thatSillyCoach") - Explicit Bean id
@Component // Default Bean id
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

}
