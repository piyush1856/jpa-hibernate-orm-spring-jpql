package com.masai.usecase;

import com.masai.dao.FitnessDao;
import com.masai.dao.FitnessDaoImpl;
import com.masai.entities.Gym;

public class AddGymUseCase {
	
	public static void main(String[] args) {
		
		
		Gym gym = new Gym();
		gym.setGym_name("Sparks");
		gym.setMonthly_fee(1200);
		
		FitnessDao dao = new FitnessDaoImpl();
		dao.addGym(gym);
		
		
		
		
	}

}
