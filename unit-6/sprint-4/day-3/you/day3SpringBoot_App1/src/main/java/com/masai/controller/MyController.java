package com.masai.controller;

import java.util.ArrayList;
import java.util.List;

import javax.management.modelmbean.RequiredModelMBean;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController  // by default all data will be treated as raw data and entire application will become web services
				 // @Controller + @ResponseBody
@RequestMapping("/studweb")
public class MyController {
	
	//http://localhost:8888/hello
	
	@RequestMapping("/hello")
	//@ResponseBody
	public String sayHello() {
		return "Welcome to Masai School";
	}
	
	
	@RequestMapping("/hi")
	//@ResponseBody
	public String sayHello2() {
		return "Welcome to spring  boot";
	}
	
	
	//http://localhost:8888/stud
	@RequestMapping("/stud")
	public Student getStudent() {
		Student s = new Student(10, "Piyush", 100);
		
		return s;
	}
	
	//http://localhost:8888/students/10?n=ram
	@GetMapping("/students/{roll}") 
	public /*List<Student>*/ Student getStudList(@PathVariable("roll") Integer roll,
												 @RequestParam("n") String name){
		
		Student s = new Student(roll, name, 500);
		return s;
	
	}
	
	
	//@PostMapping(value = "/studnets", consumes = MediaType.APPLICATION_JSON_VALUE)
	@PostMapping("/students")
	public String registerStudent(@RequestBody Student s ) {
		
		// here we can connect with the database and the save the student object in database
		return "Student Stored" + s;
		
	}
	
	
	
	
	
}
