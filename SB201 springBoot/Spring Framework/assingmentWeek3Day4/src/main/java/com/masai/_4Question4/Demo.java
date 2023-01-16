package com.masai._4Question4;

import java.util.Map;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;


@Lazy
@Controller(value = "demo")
public class Demo {
	
	@Autowired(required = false)
	@Qualifier(value = "map")
	private Map<Department, Employee> theMap;
	
	@PostConstruct
	public void myInit(){
		System.out.println("inside myInit method");
	}

	@PreDestroy
	public void cleanUp(){
		System.out.println("inside cleanUp method");
	}
	
	
	public void showDetails(){
		System.out.println("inside showDetails of Demo class");
		//print all the details of all the employees department-wise.
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		Demo d = ctx.getBean("demo",Demo.class);
		
		Map<Department, Employee> hm =d.theMap;
		
		Set<Map.Entry<Department, Employee>>  keyValue = hm.entrySet();
		for(Map.Entry<Department, Employee> element : keyValue) {
			System.out.println(element.getKey() +"====>"+ element.getValue());
		}
		 
		((AnnotationConfigApplicationContext)ctx).close();	
	}
	
	public static void main(String[] args) {
		
		Demo d = new Demo();
		d.showDetails();	
	}
		
}
