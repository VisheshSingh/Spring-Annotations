package com.springAnnotations;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	String data[] = { "A good friendship is often more important than a passionate romance",
			"Success is going from failure to failure without loss of enthusiasm",
			"The value lies not within any particular thing, but in the desire placed on that thing."

	};

	private Random myRand = new Random();

	@Override
	public String getFortune() {
		int index = myRand.nextInt(data.length);
		String fortune = data[index];
		return fortune;
	}

}
