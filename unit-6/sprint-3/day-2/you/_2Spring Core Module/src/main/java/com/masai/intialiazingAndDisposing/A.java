package com.masai.intialiazingAndDisposing;

public class A {
	
	int age;
	String name;
	
	public A() {
		System.out.println("Inside constructor A");
		
		System.out.println("Inside constructor age is : " + age);
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void showA() {

		System.out.println("Inside showA of A");
		
	}
	public void mySetup() {
		//Connection creation logic
		//initialization logic
		
		System.out.println("Inside mySetup method of A");
		
		System.out.println("Inside mySetup age is : " + age);
	}
	
	public void myDestroy() {
		System.out.println("Inside myDestroy");
	}
	
}
