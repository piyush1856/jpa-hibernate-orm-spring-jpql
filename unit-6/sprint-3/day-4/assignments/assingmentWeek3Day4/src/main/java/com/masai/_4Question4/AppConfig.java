package com.masai._4Question4;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.masai._4Question4"})
public class AppConfig {
	
	@Bean("map")
	public Map<Department, Employee> myMap(){
		
		Map<Department, Employee> theMap = new HashMap<>();
		
		theMap.put(d1(),e1() );
		theMap.put(d2(), e2() );
		theMap.put(d3(), e3());
		
		return theMap;	
	}
	
	@Bean
	public Department d1() {
		
		Department d = new Department(1, "Sales", "Mumbai");
		return d;
	}
	@Bean
	public Department d2() {
		
		Department d = new Department(2, "marketing", "Delhi");
		return d;
	}
	@Bean
	public Department d3() {
		
		Department d = new Department(3, "Accounts", "Kolkata");
		return d;
	}
	
	@Bean
	public Employee e1() {
		Employee e = new Employee(10, "Piyush", "Godda", 40000);
		return e;
	}
	
	@Bean
	public Employee e2() {
		Employee e = new Employee(11, "Prashant", "Ranchi", 50000);
		return e;
	}
	@Bean
	public Employee e3() {
		Employee e = new Employee(12, "Shivam", "Kanpur", 60000);
		return e;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
