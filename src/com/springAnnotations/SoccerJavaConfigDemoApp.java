package com.springAnnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SoccerJavaConfigDemoApp {

	public static void main(String[] args) {

		// load the Spring Config Java Class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		// Retrieve the bean from the Spring config file
		SoccerCoach theCoach = context.getBean("soccerCoach", SoccerCoach.class);

		// call the methods of the bean (class/interface)
		System.out.println(theCoach.getDailyWorkout());

		// call the new methods of bean
		System.out.println(theCoach.getDailyFortune());

		// // call out new swim coach methods
		// System.out.println("email: " + theCoach.getEmail());
		// System.out.println("team: " + theCoach.getTeam());

		// close the context
		context.close();

	}

}
