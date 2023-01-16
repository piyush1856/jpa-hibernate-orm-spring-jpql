package com.masai._3Question3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope("prototype")
public class Travel {
	
	@Autowired
	private Car c;
	
	@Autowired
	private Bike b;
	

//	public void journeyWithCar() {
//		c.go();
//		System.out.println("Jounrney started...");
//	}
//	
//	public void journeyWithBike() {
//		b.go();
//		System.out.println("Jounrney started...");
//	}


	public void journey(Vehicle v) {
		v.go();
		System.out.println("Jounrney started...");
	}
}
