package com.masai.springCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.masai.coupling.Travel;

public class Demo {
	
	public static void main(String[] args) {
		
		//activate the spring IOC container
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//pulling the springBean object with the help of ID
//		MyBusinessClass obj = ctx.getBean("mb", MyBusinessClass.class);
//		
//		obj.fun1();
		
		
//		Travel obj2 = ctx .getBean("travel",Travel.class);
//		obj2.journey();
		
		Travel obj3 = ctx .getBean("travel2",Travel.class);
		obj3.journey();
		
		

	}

}
