package com.masai.day2;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	
	@Id
	private int roll;
	private int marks;
	private String name;
	public Student() {
	// TODO Auto-generated constructor stub
	}
	public Student(int roll, String name, int marks) {
	super();
	this.roll = roll;
	this.name = name;
	this.marks = marks;
	}
	public int getRoll() {
	return roll;
	}
	public void setRoll(int roll) {
	this.roll = roll;
	}
	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	public int getMarks() {
	return marks;
	}
	public void setMarks(int marks) {
	this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}

}

