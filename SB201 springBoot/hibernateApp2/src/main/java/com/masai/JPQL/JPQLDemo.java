package com.masai.JPQL;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.masai.model.Account;
import com.masai.utility.EMUtil;


public class JPQLDemo {
	
	public static void main(String[] args) {
		
		EntityManager em = EMUtil.provideEntityManager();
//		
//		//String jpql = "select a from Acount a";
//		String jpql = "from Account";
//		
//		Query q = em.createQuery(jpql);
//		
//		List<Account> accList = q.getResultList();
//		
//		accList.forEach(a -> System.out.println(a));
//		
//		em.close();
		
		
		
		//String jpql= "select a from Account a where a.name='Ram' ";
//		String jpql= "from Account where name='Ramesh'";
//		Query q= em.createQuery(jpql);
//				
//		List<Account> list= q.getResultList();
//				
//		for(Account acc:list){
//			System.out.println(acc);
//		}
//		
//		em.close();
		
		
		
		
		//if we conform that only one row will come then :-
		
		//String jpql= "select a from Account a where a.name='Ram' ";
				String jpql= "from Account where name='Ramesh'";
				//Query q= em.createQuery(jpql);
				
				//Instead of downcasting use typedQuery
				TypedQuery<Account> q = em.createQuery(jpql,Account.class);
				Account acc = q.getSingleResult();
				
//				Object obj= q.getSingleResult();
//				Account acc= (Account)obj;
				
				//Account acc= (Account)q.getSingleResult();
				
				System.out.println(acc);
		
		// --if the above query will return more that one result then it will throw a runtime exception
		
	}
	
	

}
