package com.masai.coupling;

public class Bike implements Vehicle{
	
	public void ride() {
		System.out.println("ride started....");
	}


	public void go() {
		ride();
		
	}

}
