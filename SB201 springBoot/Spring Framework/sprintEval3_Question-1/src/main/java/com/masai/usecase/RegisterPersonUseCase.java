package com.masai.usecase;

import com.masai.dao.FitnessDao;
import com.masai.dao.FitnessDaoImpl;
import com.masai.entities.Person;
import com.masai.exceptions.GymException;

public class RegisterPersonUseCase {
	
	public static void main(String[] args) {
		
		Person p = new Person();
		p.setEmail("p@g");
		p.setMobile("6356345");
		p.setName("Piyush");
		
		FitnessDao dao = new FitnessDaoImpl();
		try {
			dao.registerPerson(p, 1);
		} catch (GymException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		
		
		
	}

}
