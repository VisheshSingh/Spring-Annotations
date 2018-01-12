package com.springAnnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
// @ComponentScan("com.springAnnotations")
@PropertySource("classpath:sport.properties") // Load Properties from Spring file
public class SportConfig {

	// define bean for sadFortuneService
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}

	// define bean for swim coach and inject dependency
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}

	// define bean for cheerfulFortuneService
	@Bean
	public FortuneService cheerfulFortuneService() {
		return new CheerfulFortuneService();
	}

	// define bean for soccer coach and inject dependency
	@Bean
	public Coach soccerCoach() {
		return new SoccerCoach(cheerfulFortuneService());
	}

}
