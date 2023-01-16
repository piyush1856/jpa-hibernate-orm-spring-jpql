package com.masai.coupling;

public class Travel {
	
	//it is the dependency
	Vehicle v; //here we can store one of its implemented class obj.
	
	private int noOfPerson;

	
	public Travel(Vehicle v, int noOfPerson) {
		super();
		this.v = v;
		this.noOfPerson = noOfPerson;
	}



//	//setter injection point
//	public void setV(Vehicle v) {
//		this.v=v;
//	}
//	
//	//setter injection point
//	public void setNoOfPerson(int noOfPerson) {
//		this.noOfPerson = noOfPerson;
//	}


	public void journey() {
		v.go();
		System.out.println("Jounrney started...");
		System.out.println("No of person" + noOfPerson);
	}

}
