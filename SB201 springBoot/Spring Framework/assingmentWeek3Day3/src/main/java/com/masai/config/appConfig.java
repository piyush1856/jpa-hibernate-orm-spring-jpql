package com.masai.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

import com.masai._1Question1.Student;
import com.masai._3Question3.Bike;
import com.masai._3Question3.Car;

@Configuration
@ComponentScan(basePackages = {"com.masai"})
@PropertySources({
	@PropertySource("cities.properties")
})
public class appConfig {
	
	@Bean("stList")
	public List<Student> getStudent(){
		
		List<Student> studListFromConfig = new ArrayList<>();
		studListFromConfig.add(new Student(10, "Piyush", 50));
		studListFromConfig.add(new Student(14, "Nirnay", 90));
		studListFromConfig.add(new Student(13, "Harshit", 80));
		studListFromConfig.add(new Student(12, "Ritesh", 70));
		studListFromConfig.add(new Student(11, "Prashant", 60));
		
		
		return studListFromConfig;
		
	}
	
	@Bean("car")
	public Car getCar() {
		Car c = new Car();
		return c;
		
	}
	
	@Bean("bike")
	public Bike getBike() {
		Bike b = new Bike();
		return b;
	}

}
