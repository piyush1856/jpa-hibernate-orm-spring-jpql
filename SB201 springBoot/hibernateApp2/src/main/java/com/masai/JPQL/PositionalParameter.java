package com.masai.JPQL;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.utility.EMUtil;

public class PositionalParameter {
	
	public static void main(String[] args) {
		
		
EntityManager em= EMUtil.provideEntityManager();
		
		
		String jpql= "update Account set balance=balance+?1 where name=?2";
		
		Query q= em.createQuery(jpql);
		
		q.setParameter(1, 1000);
		q.setParameter(2, "Ramesh");
		
		em.getTransaction().begin();
		int x=q.executeUpdate();
		em.getTransaction().commit();
		
		em.close();
		
		System.out.println(x+" record updated...");


//--index value can start with any number...
		
		
		
		
		
		
		
	}

}
