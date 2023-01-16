package com.masai._3Question3;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class Bike implements Vehicle{
	
	public void ride() {
		System.out.println("ride started....");
	}


	public void go() {
		ride();
		
	}

}
