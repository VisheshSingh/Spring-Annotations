package com.springAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsBeanScopeDemoApp {

	public static void main(String[] args) {

		// load the Spring Config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Retrieve the bean from the Spring config file
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

		// check if they are same
		boolean result = (theCoach == alphaCoach);

		// print out the results
		System.out.println("\n Pointing out to the same object: " + result);

		System.out.println("\n Memory location of theCoach: " + theCoach);

		System.out.println("\n Memory location of alphaCoach: " + alphaCoach);

		// close the context
		context.close();

	}

}
