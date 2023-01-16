package com.masai.usecase;

import com.masai.dao.FitnessDao;
import com.masai.dao.FitnessDaoImpl;
import com.masai.entities.Trainer;

public class RegisterTrainerUseCase {
	
	public static void main(String[] args) {
		
		Trainer t = new Trainer();
		t.setEmail("t@g");
		t.setTrainer_name("vivek");
		t.setYear_of_experience(2);
		
		FitnessDao dao = new FitnessDaoImpl();
		dao.registerTrainer(t);
		
		
		
		
		
		
		
	}

}
