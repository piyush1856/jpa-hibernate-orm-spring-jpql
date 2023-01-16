package com.masai.autowireAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service     //@Autowired(required = false) in A class
public class B {
	
	public void funB() {
		System.out.println("inside funB of B");
	}


}
