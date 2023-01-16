package com.masai.intialiazingAndDisposing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		A a = ctx.getBean("aid",A.class);
		a.showA();
		
		ClassPathXmlApplicationContext ctx2 = (ClassPathXmlApplicationContext) ctx;
		
		ctx2.close(); // to close the container
		//call method by down casting the interface to class
			
		
	}

}
