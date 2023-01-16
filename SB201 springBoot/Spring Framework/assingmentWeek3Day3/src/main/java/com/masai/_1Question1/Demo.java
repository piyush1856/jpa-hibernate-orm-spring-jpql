package com.masai._1Question1;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.masai.config.appConfig;

public class Demo {
	
	public static void main(String[] args) {
		 
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(appConfig.class);
		
		CommonClass commonClass = ctx.getBean(CommonClass.class);
		System.out.println(commonClass.getCities());
		
		
		List<Student> sList =commonClass.getStudList();
		sList.forEach(s -> System.out.println(s));
		
		
		AnnotationConfigApplicationContext atx = (AnnotationConfigApplicationContext) ctx;
		
		atx.close();
		
	}

}
