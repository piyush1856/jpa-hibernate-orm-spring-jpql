package com.masai.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.EMUtility;
import com.masai.entities.Gym;
import com.masai.entities.Person;
import com.masai.entities.Trainer;
import com.masai.exceptions.GymException;
import com.masai.exceptions.TrainerException;

public class FitnessDaoImpl implements FitnessDao{

	@Override
	public void addGym(Gym gym) {
		
		EntityManager em = EMUtility.provideEntityManager();
		
		em.getTransaction().begin();
		em.persist(gym);
		em.getTransaction().commit();
		
		em.close();
		
		System.out.println("Done");
		
	}

	@Override
	public void registerPerson(Person person, int gym_id) throws GymException {
		
		EntityManager em = EMUtility.provideEntityManager();
		
		try {
			Gym g =em.find(Gym.class, gym_id);
			
			g.getPersons().add(person);
			person.getGyms().add(g);
			
			em.getTransaction().begin();
			em.persist(person);
			em.persist(g);
			em.getTransaction().commit();
			
			em.close();
		}catch (Exception e) {
			throw new GymException(e.getMessage());
		}
		
		
	}

	@Override
	public void registerTrainer(Trainer trainer) {

		EntityManager em = EMUtility.provideEntityManager();
		
		em.getTransaction().begin();
		em.persist(trainer);
		em.getTransaction().commit();
		
		em.close();
		
		System.out.println("Done");
		
	}

	@Override
	public void assignTrainerWithGym(int trainer_id, int gym_id) throws TrainerException, GymException {
		EntityManager em = EMUtility.provideEntityManager();
		
		
		try {
			Trainer t = em.find(Trainer.class, trainer_id);
			Gym g = em.find(Gym.class, gym_id);
			
			t.getTrainerGymList().add(g);
			g.setTrainer(t);
			
			
			
			em.getTransaction().begin();
			em.persist(g);
			em.getTransaction().commit();
			
			em.close();
			
		}catch (Exception e) {
			throw new GymException(e.getMessage());
		}
		
		
	}

	@Override
	public List<Person> getAllthePersonbyGymName(String gym_name) throws GymException {
		List<Person> personList = null;
		
		EntityManager em = EMUtility.provideEntityManager();
		
		try {
			Query q = em.createQuery("select gym_id from Gym where gym_name =:name");
			q.setParameter("name", gym_name);
			
			int gym_id = (int)q.getSingleResult();
			
		
			
		  Gym g2 = em.find(Gym.class, gym_id);
			
			personList= g2.getPersons();
		}catch(Exception e) {
			throw new GymException(e.getMessage());
		}
	
		
		
		
		return personList;
	}
	

}
