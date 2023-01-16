package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		PersonService personService = ctx.getBean("person_service",PersonService.class);
		
		personService.printMap();
		
		personService.printList();
		
		personService.printAppName();

	}

}
