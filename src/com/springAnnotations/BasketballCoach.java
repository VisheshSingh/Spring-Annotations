package com.springAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("mrJordanTheGreat")
public class BasketballCoach implements Coach {

	public FortuneService fortuneService;

	// Define a constructor
	@Autowired
	public BasketballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Dribbling and 3-pointer practice in the morning";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
