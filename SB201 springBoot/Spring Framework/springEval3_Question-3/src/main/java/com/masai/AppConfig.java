package com.masai;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@ComponentScan(basePackages = {"com.masai"})
@PropertySources({
	@PropertySource("appName.properties")
})
public class AppConfig {
	
	@Bean
	public Person p1() {
		Person p = new Person(1, "Piyush", "p@g", 25, "7854123690");
		return p;
	}
	@Bean
	public Person p2() {
		Person p = new Person(2, "Ayush", "a@g", 23, "8884123690");
		return p;
	}
	@Bean
	public Person p3() {
		Person p = new Person(3, "Ritesh", "r@g", 26, "9994123690");
		return p;
	}
	@Bean
	public Person p4() {
		Person p = new Person(4, "Shatak", "s@g", 27, "6856123690");
		return p;
	}
	@Bean
	public Person p5() {
		Person p = new Person(5, "Nirnay", "n@g", 28, "6544123690");
		return p;
	}
	
	@Bean
	public Gym g1() {
		Gym g = new Gym(10, "Sparks Fitness", 2500);
		return g;
	}
	
	@Bean
	public Gym g2() {
		Gym g = new Gym(10, "Sparks Fitness", 2500);
		return g;
	}
	
	@Bean
	public Gym g3() {
		Gym g = new Gym(10, "Sparks Fitness", 2500);
		return g;
	}
	
	@Bean(value = "map")
	public Map<Person, Gym> myMap(){
		
		Map<Person, Gym> myMap = new HashMap<>();
		
		myMap.put(p1(), g1());
		myMap.put(p2(), g2());
		myMap.put(p3(), g3());
		
		return myMap;
	}
	
	@Bean(value = "list")
	public List<Person> personList(){
		
		List<Person> list = new ArrayList<>();
		
		list.add(p1());
		list.add(p2());
		list.add(p3());
		list.add(p4());
		list.add(p5());
		
		return list;
	}

}
