package com.masai._1Question1;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service(value="fiveCity")
public class CommonClass {

	List<String> cityList;
	
	@Value("${city.name}")
	String cities;
	
	@Autowired
	@Qualifier("stList")
	private List<Student> studList;
	
	public List<String> getCities(){
		cityList = Arrays.asList(cities.split(","));
		return cityList;
	}
	
	
	public List<Student> getStudList(){
		return studList;
	}
	
	@PostConstruct
	public void initialize() {
		System.out.println("Used Post Construct");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Used PreDestroy");
	}
	
	
}
