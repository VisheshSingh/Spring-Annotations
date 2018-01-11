package com.springAnnotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

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

	// Define init and destroy methods
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">> TennisCoach: This is init method");
	}

	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(">> TennisCoach: This is destroy method");
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
