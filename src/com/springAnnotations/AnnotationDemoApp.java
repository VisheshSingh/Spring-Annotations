package com.springAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		// load the Spring Config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Retrieve the bean from the Spring config file
		Coach theCoach = context.getBean("tennisCoach", Coach.class);

		// call the methods of the bean (class/interface)
		System.out.println(theCoach.getDailyWorkout());

		// call the new methods of bean
		System.out.println(theCoach.getDailyFortune());

		// close the context
		context.close();

	}

}
