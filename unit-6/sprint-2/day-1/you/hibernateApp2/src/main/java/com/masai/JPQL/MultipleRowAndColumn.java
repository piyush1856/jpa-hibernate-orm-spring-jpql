package com.masai.JPQL;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.masai.utility.EMUtil;



public class MultipleRowAndColumn {
	
	public static void main(String[] args) {
		
		
		
EntityManager em= EMUtil.provideEntityManager();
		
		
		String jpql= "select balance from Account";
		
		TypedQuery<Integer> q=em.createQuery(jpql,Integer.class);
		
		List<Integer> list= q.getResultList();
		
		System.out.println(list);

		
		
		
		
		
		
		
		
	}

}
