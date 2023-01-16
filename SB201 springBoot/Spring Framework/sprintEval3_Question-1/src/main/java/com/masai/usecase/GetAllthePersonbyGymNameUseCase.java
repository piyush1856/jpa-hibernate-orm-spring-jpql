package com.masai.usecase;

import com.masai.dao.FitnessDao;
import com.masai.dao.FitnessDaoImpl;
import com.masai.exceptions.GymException;

public class GetAllthePersonbyGymNameUseCase {
	
	public static void main(String[] args) {
		
		FitnessDao dao = new FitnessDaoImpl();
		try {
			(dao.getAllthePersonbyGymName("Sparks")).forEach(s -> {
				System.out.println(s.getName());
				System.out.println(s.getEmail());
				System.out.println(s.getMobile());
				System.out.println(s.getPerson_id());
				
			});
		} catch (GymException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
