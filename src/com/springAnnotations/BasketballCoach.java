package com.springAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("mrJordanTheGreat")
public class BasketballCoach implements Coach {

	@Autowired
	@Qualifier("happyFortuneService")
	public FortuneService fortuneService;

	// default constructor
	public BasketballCoach() {
		System.out.println(">>BasketballCoach: inside the constructor");
	}

	// Define a constructor
	// @Autowired
	// public BasketballCoach(FortuneService theFortuneService) {
	// fortuneService = theFortuneService;
	// }

	@Override
	public String getDailyWorkout() {
		return "Dribbling and 3-pointer practice in the morning";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
