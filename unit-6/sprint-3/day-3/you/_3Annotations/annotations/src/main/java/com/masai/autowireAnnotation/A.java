package com.masai.autowireAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
//@Scope("prototype")
public class A {
	
	//@Autowired(required = false)
	private B b1;

	@Autowired
	public void setB1(B b1) {
		this.b1 = b1;
	}



	public void funA() {
		System.out.println("inside funA of A");
		System.out.println(b1);
	}

}
