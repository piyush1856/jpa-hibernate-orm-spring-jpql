package com.masai.JPQL;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.utility.EMUtil;

public class _1Row1Coloumn {
	
	
	public static void main(String[] args) {
		
		
		
		EntityManager em= EMUtil.provideEntityManager();

		//String jpql ="select name from Account where accno =:ano";		
		String jpql ="select a.name from Account a where accno =:ano";	
		Query q= em.createQuery(jpql);

		 q.setParameter("ano", 105);
		
		 String n= (String)q.getSingleResult();
		 
		 System.out.println(n);


//			TypedQuery<String> q=em.createQuery(jpql,String.class);
//			
//			q.setParameter("ano", 105);
//			
//			String n= q.getSingleResult();
//			
	//
//			System.out.println(n);
		
		
		
	}
}
