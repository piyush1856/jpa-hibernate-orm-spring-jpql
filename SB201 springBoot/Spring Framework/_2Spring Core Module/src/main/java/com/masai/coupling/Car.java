package com.masai.coupling;

public class Car implements Vehicle{
	
	public void start() {
		System.out.println("Car started...");
	}

	public void go() {
		start();
		
	}
	
	

}
