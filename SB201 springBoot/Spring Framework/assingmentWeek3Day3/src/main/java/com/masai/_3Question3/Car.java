package com.masai._3Question3;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class Car implements Vehicle{
	
	public void start() {
		System.out.println("Car started...");
	}

	public void go() {
		start();
		
	}

}
