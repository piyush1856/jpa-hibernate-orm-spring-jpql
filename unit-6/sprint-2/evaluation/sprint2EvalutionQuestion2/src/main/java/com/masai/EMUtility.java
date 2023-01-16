package com.masai;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMUtility {
	
	private static EntityManagerFactory emf;
	
	static{
		emf=Persistence.createEntityManagerFactory("studentUnit");
	}
	
	public static EntityManager provideEntityManager(){
		
		//EntityManager em= emf.createEntityManager();
		//return em;
		
		return emf.createEntityManager();
	}

}
