package com.masai.usecases;

import javax.persistence.EntityManager;

import com.masai.model.Employee;
import com.masai.utility.EMUtility;

public class MainDeleteMe {
	
	public static void main(String[] args) {
		
		EntityManager em = EMUtility.provideEntityManager();
		
		Employee e = new Employee("Piyush9", "Godda", 500002);
		
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
		em.close();
		
		
		
		
		
		
		
	}

}
