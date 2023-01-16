package com.masai.JPQL;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.model.Account;
import com.masai.utility.EMUtil;

public class NamedQuery {
	
	public static void main(String[] args) {
		
		
		
		EntityManager em= EMUtil.provideEntityManager();
		
		
		Query q= em.createNamedQuery("account.getBalance");
		
		q.setParameter("bal", 5000);
		
		List<Account> list= q.getResultList();
		
		list.forEach(a -> System.out.println(a));
		
		
		
		
		
		
		
		
		
		
	}

}
