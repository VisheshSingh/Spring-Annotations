package com.springAnnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {

		// load the Spring Config Java Class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		// Retrieve the bean from the Spring config file
		Coach theCoach = context.getBean("swimCoach", Coach.class);

		// call the methods of the bean (class/interface)
		System.out.println(theCoach.getDailyWorkout());

		// call the new methods of bean
		System.out.println(theCoach.getDailyFortune());

		// close the context
		context.close();

	}

}
