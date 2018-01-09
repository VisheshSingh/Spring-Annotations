package com.springAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("thatSillyCoach") - Explicit Bean id
@Component // Default Bean id
public class TennisCoach implements Coach {

	@Autowired // Field injection
	@Qualifier("randomFortuneService")
	public FortuneService fortuneService;

	// Define a constructor for constructor injection
	// @Autowired
	// public TennisCoach(FortuneService theFortuneService) {
	// fortuneService = theFortuneService;
	// }

	// default constructor just for tracing
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside the constructor");
	}

	// @Autowired // Setter injection
	// public void setFortuneService(FortuneService fortuneService) {
	// System.out.println(">> TennisCoach: this is inside the setter method!");
	// this.fortuneService = fortuneService;
	// }

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
