package com.springAnnotations;

public class CheerfulFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today will be cheerful day for you!";
	}

}
