package com.masai.finalizeMethod;

public class Demo {
	
	public Demo() {
		System.out.println("Object created");
	}
	
	@Override
	protected void finalize() throws Throwable {
		
		System.out.println("Object dies ...");
	}
	public static void main(String[] args) {
		
		Demo d1 = new Demo();
		d1=null; 	//eligible for garbage collector but might get killed late
		
		System.gc(); // invoke GC and kill all eligible right now
		//forcefully initiate the garbage collector	
	}
}
