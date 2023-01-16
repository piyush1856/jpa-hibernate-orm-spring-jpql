package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
	
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Collage collage = ctx.getBean("collageId",Collage.class); 
		
		collage.showDetails();
			
		ClassPathXmlApplicationContext ctx2 =(ClassPathXmlApplicationContext)ctx;
		 
		ctx2.close();
	}

}
