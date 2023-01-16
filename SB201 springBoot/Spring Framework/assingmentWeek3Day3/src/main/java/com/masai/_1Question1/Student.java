package com.masai._1Question1;

import org.springframework.stereotype.Service;


public class Student {
	
	
	private int roll;
	private String name;
	private int marks;
	
	public Student(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
	
	
	

}
