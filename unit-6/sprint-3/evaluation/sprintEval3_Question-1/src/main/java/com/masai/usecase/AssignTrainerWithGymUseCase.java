package com.masai.usecase;

import com.masai.dao.FitnessDao;
import com.masai.dao.FitnessDaoImpl;
import com.masai.exceptions.GymException;
import com.masai.exceptions.TrainerException;

public class AssignTrainerWithGymUseCase {
	
	public static void main(String[] args) {
		
		
		FitnessDao dao = new FitnessDaoImpl();
		try {
			dao.assignTrainerWithGym(3, 1);
		} catch (TrainerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (GymException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
