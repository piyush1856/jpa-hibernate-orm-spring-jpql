package com.masai.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.InvalidRollException;
import com.masai.model.Student;

import jakarta.annotation.PostConstruct;

@RestController
public class StudentController {

	private List<Student> students = new ArrayList<>();
	
	@PostConstruct
	public void setUpStudent() {
		students.add(new Student(102, "Piyush4", "Ranchi1", 454));
		students.add(new Student(101, "Piyush3", "Ranchi2", 453));
		students.add(new Student(103, "Piyush2", "Ranchi3", 452));
		students.add(new Student(104, "Piyush1", "Ranchi4", 451));
	}
	
	@GetMapping("/students")
	public ResponseEntity<List<Student>>  getAllStudentHandler(){
		
		return new ResponseEntity<List<Student>>(students,HttpStatus.OK);
	}
	
	@PostMapping("/students")
	public ResponseEntity<Student>  registerStudentHandler(@RequestBody Student student) {
		
		students.add(student);
		
		HttpHeaders hh = new HttpHeaders();
		hh.add("abc", "xyz");
		hh.add("Authorization", "jwtToken");
		hh.add("role", "admin");
		
		ResponseEntity<Student> re = new ResponseEntity<Student>(student,hh,HttpStatus.CREATED); // can be also used without headers(hh)
		
		return re;
	}
	
	@GetMapping("/students/{roll}")
	public Student getStudentHandler(@PathVariable("roll") Integer roll) {
		
		Student s = null;
		
		for(Student s1 : students) {
			if(s1.getRoll() == roll) {
				 s= s1;
			}
		}
		
		if( s != null) {
			return s;
		}else {
			throw new IllegalArgumentException("Student doesn't exist with roll ; " + roll);
		}
		
	}
	
	@DeleteMapping("/students/{roll}")
	public String deleteStudentHandler(@PathVariable("roll") Integer roll) {
		
		boolean flag = true;
		
		for(int i=0;i<students.size();i++) {
			
			if(students.get(i).getRoll() == roll) {
				students.remove(i);
				flag = false;
				break;
			}
		}
		
		if(!flag) {
			return "Student deleted successfully";
		}else {
			throw new IllegalArgumentException("Student doesn't exist with roll : " + roll);
		}
		
		
	}
	
	
	@PutMapping("/students/{roll}")
	public Student updateStudentHandler(@RequestBody Student student, @PathVariable("roll") Integer roll) {
		
		for(int i=0;i<students.size();i++) {
			
			if(students.get(i).getRoll() == roll) {
				Student existingStudent = students.get(i);
				//existingStudent = student;
				
				existingStudent.setName(student.getName());
				existingStudent.setAddress(student.getAddress());
				existingStudent.setMarks(student.getMarks());
				
		
				return existingStudent;
			}
		}
		
		throw new IllegalArgumentException("Student not found with roll : " + roll);
				
	}
	
	
	// exception handling
	
	@GetMapping("/getStudent/{roll}")
	public Student getStudentDetails(@PathVariable("roll") Integer roll) throws InvalidRollException {
		if(roll > 200)
//			throw new IllegalArgumentException("Roll number should be less than 200");
		
			throw new InvalidRollException("Roll number should be less than 200");
			
			
		int x = roll/0;
		
		
			return new Student(roll, "n1","adr1", 5565);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
