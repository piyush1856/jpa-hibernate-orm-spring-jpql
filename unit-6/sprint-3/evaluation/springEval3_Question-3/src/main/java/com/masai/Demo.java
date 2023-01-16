package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		PersonService ps = ctx.getBean("ps",PersonService.class);
		
		ps.printMap();
		
		ps.printList();
		
		ps.printAppName();

	}

}
