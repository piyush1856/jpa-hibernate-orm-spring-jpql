package com.masai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.piyush.B;

@SpringBootApplication  //shortcut of @Configuration + @ComponentScan + @EnableAutoConfiguration
@ComponentScan(basePackages = "com.piyush")
public class Day2SpringBootIntroApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Day2SpringBootIntroApplication.class, args);
		//it will return application context.
		
		//pulling the object
//		_1A obj = ctx.getBean("_1A",_1A.class);
//		obj.funA();
	
		B obj2 = ctx.getBean("b", B.class);
		obj2.funB();
	
	
	}

}
