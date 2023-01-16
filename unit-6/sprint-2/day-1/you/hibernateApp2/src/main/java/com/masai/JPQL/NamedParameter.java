package com.masai.JPQL;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.utility.EMUtil;

public class NamedParameter {
	
	public static void main(String[] args) {
		
		EntityManager em= EMUtil.provideEntityManager();
		
		
		String jpql= "update Account set balance=balance+:bal where name=:nm";
		
		Query q= em.createQuery(jpql);
		
		q.setParameter("bal", 600);
		q.setParameter("nm", "Ramesh");
		
		em.getTransaction().begin();
		int x=q.executeUpdate();
		em.getTransaction().commit();
		
		
		System.out.println(x+" record updated...");
		
//		****Note: For Insert operation we don't use JPQL, we always use persist method
//		of EntityManager.
		
		
		
	}

}
