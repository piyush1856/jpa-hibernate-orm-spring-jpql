package com.masai.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Employee;

@RestController
public class MyService {
	
	@GetMapping("/sayhello")
	public String sayHello(@RequestParam("name") String name){
		return "Welcome "+name;
	}
	
	@GetMapping
	public String hello() {
		return "Welcome to Spring boot";
	}
	
	@GetMapping("/employee")
	public Employee getEmployee() {
		
		Employee e = new Employee(10, "Piyush", "Godda", 12045);
		
		return e;
	}
	
	
	@GetMapping("/employees")
	public List<Employee> empList(){
		
		List<Employee> empList = new ArrayList<>();
		
		empList.add(new Employee(10, "Piyush5", "Godda", 12045));
		empList.add(new Employee(11, "Piyush4", "Godda1", 52045));
		empList.add(new Employee(12, "Piyush3", "Godda2", 42045));
		empList.add(new Employee(13, "Piyush2", "Godda3", 32045));
		empList.add(new Employee(14, "Piyush1", "Godda4", 22045));
		
		return empList;
		
		
		
		
	}


}
