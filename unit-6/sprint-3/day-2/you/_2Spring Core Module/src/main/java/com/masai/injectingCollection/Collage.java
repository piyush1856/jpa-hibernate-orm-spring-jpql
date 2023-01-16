package com.masai.injectingCollection;

import java.util.List;

public class Collage {
	
	//simple type
	private String collageName;
	//collection type
	private List<Student> students;
	
	public String getCollageName() {
		return collageName;
	}
	
	//constructor injection point for collageName
	public Collage(String collageName) {
		this.collageName = collageName;
	}
	
	//setter injection point for List
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	public List<Student> getStudents() {
		return students;
	}

}
