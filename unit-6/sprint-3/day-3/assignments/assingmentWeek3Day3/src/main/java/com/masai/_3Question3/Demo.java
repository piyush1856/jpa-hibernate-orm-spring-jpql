package com.masai._3Question3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.masai.config.appConfig;

public class Demo {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(appConfig.class);
		
		
		Travel t1 = ctx.getBean(Travel.class);
//		t1.journeyWithCar();
		
		
		t1.journey(new Bike());
		
		Travel t2 = ctx.getBean(Travel.class);
		//t2.journeyWithBike();
		
		Car c = ctx.getBean(Car.class,"car");
		
		
		t2.journey(c);
		
		
		AnnotationConfigApplicationContext atx = (AnnotationConfigApplicationContext) ctx;
		atx.close();
		
		
		
	}

}
