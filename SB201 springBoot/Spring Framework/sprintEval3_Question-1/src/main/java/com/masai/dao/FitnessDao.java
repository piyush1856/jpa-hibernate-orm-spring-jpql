package com.masai.dao;

import java.util.List;

import com.masai.entities.Gym;
import com.masai.entities.Person;
import com.masai.entities.Trainer;
import com.masai.exceptions.GymException;
import com.masai.exceptions.TrainerException;

public interface FitnessDao {
	
	public void addGym(Gym gym);
	
	public void registerPerson(Person person,int gym_id)throws GymException;
	
	public void registerTrainer(Trainer trainer);
	
	public void assignTrainerWithGym(int trainer_id, int gym_id) throws TrainerException, GymException;
	
	public List<Person> getAllthePersonbyGymName(String gym_name) throws GymException;

}
