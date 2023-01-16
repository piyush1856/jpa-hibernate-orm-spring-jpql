package com.masai.utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

public class EMUtility {
	
	private static EntityManagerFactory emf;
	
	static{
		try {
			emf=Persistence.createEntityManagerFactory("assignUnit");
		}catch(Exception p){
			System.out.println(p.getMessage());
		}
	}
	
	public static EntityManager provideEntityManager(){
		
		//EntityManager em= emf.createEntityManager();
		//return em;
		
		return emf.createEntityManager();
	}

}
