package com.springAnnotations;

import org.springframework.stereotype.Component;

@Component // Default Bean id
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "This is your lucky day!";
	}

}
