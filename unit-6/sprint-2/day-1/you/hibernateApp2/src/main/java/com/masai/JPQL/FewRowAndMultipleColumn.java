package com.masai.JPQL;

import java.util.List;

import javax.persistence.*;

import com.masai.utility.EMUtil;


public class FewRowAndMultipleColumn {
	
	public static void main(String[] args) {
		
EntityManager em= EMUtil.provideEntityManager();
		
		
		String jpql= "select name,balance from Account";
		
		Query q= em.createQuery(jpql);

	
	
	 	List<Object[]> results= q.getResultList();
	 
	 	for(Object[] or: results) {
	 		
	 		 String name= (String)or[0];
	 		 int balance= (Integer)or[1];
	 		
	 		 System.out.println("Name is "+name);
	 		 System.out.println("Balance is :"+balance);
	 		 
	 		System.out.println("===========================");
	 	}
			
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
	

}
