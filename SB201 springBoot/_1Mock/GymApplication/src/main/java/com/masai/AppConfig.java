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
	public Person person1() {
		return new Person(10, "Piyush Tyagi", "piyush@masai.com", 25, "9698521470");
	}
	
	@Bean
	public Person person2() {
		return new Person(11, "Atal Pandey", "atal@masai.com", 22, "7855214701");
	}
	
	@Bean
	public Person person3() {
		return new Person(12, "Nirnay", "nirnay@masai.com", 25, "7895421470");
	}
	
	@Bean
	public Person person4() {
		return new Person(13, "Prashant", "prashant@masai.com", 25, "8698521470");
	}
	
	@Bean
	public Person person5() {
		return new Person(14, "Ritesh", "ritesh@masai.com", 25, "6668521470");
	}
	
	@Bean
	public Gym gym1() {
		return new Gym(254, "Jungli Gym", 10000);
	}
	
	@Bean
	public Gym gym2() {
		return new Gym(265, "Arnold Gym", 20000);
	}
	
	@Bean
	public Gym gym3() {
		return new Gym(274, "Cena Gym", 15000);
	}
	
	@Bean(value = "person_list")
	public List<Person> listOfPerson(){
		
		List<Person> list = new ArrayList<>();
		
		list.add(person1());
		list.add(person2());
		list.add(person3());
		list.add(person4());
		list.add(person5());
		
		return list;
		
	}
	
	@Bean(value = "personGym_map")
	public Map<Person, Gym> personGymMap(){
		
		Map<Person, Gym> map = new HashMap<>();
		
		map.put(person1(), gym1());
		map.put(person2(), gym2());
		map.put(person3(), gym3());
		
		return map;
	}
	
	
	
	
	

}
