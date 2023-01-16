package com.masai;

import javax.persistence.EntityManager;

import com.masai.entities.ContractutalEmployee;

import com.masai.entities.SalariedEmployee;
import com.masai.utility.EMUtil;

public class Demo {
	
	public static void main(String[] args) {
		
		EntityManager em = EMUtil.provideEntityManager();
		

		
		
		SalariedEmployee semp=new SalariedEmployee();
		semp.setName("Mohan");
		semp.setSalary(85000);
		
		ContractutalEmployee cemp=new ContractutalEmployee();
		cemp.setName("Hari");
		cemp.setCostPerDay(3000);
		cemp.setNoOfWorkingDays(10);
		
		em.getTransaction().begin();
		
		em.persist(semp);
		em.persist(cemp);
		em.getTransaction().commit();
		
		
		
		System.out.println("done..");		
	}
}
