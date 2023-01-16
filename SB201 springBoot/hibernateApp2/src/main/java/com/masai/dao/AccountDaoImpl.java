package com.masai.dao;

import javax.persistence.EntityManager;

import com.masai.model.Account;
import com.masai.utility.EMUtil;

public class AccountDaoImpl implements AccountDao {

	public boolean createAccount(Account account) {
		
		boolean flag = false;
		
		EntityManager em = EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(account);
		flag=true;
		
		em.getTransaction().commit();
		
		em.close();
			
		
		return flag;
	}

	public boolean deleteAccount(int accno) {
		boolean flag = false;
		
		EntityManager em = EMUtil.provideEntityManager();
		
		Account acc = em.find(Account.class, accno);
		
		if(acc != null) {
			em.getTransaction().begin();
			
			em.remove(acc);
			flag = true;
			
			em.getTransaction().commit();
		}
		
		em.close();
		
		return flag;
	}

	public boolean updateAccount(Account account) {
		boolean flag = false;
		
		EntityManager em = EMUtil.provideEntityManager();
		
		Account acc = em.find(Account.class, account.getAccno());
		
		if(acc == null) {
			throw new IllegalArgumentException("Invalid Account");
		}else {
			
			em.getTransaction().begin();
			
			em.merge(account);  //setter can also be used
			flag = true;
			
			em.getTransaction().commit();
			
		}
		em.close();
		
		return flag;
	}

	public Account findAccount(int accno) {
		
//		Account acc = null;
//		
//		EntityManager em = EMUtil.provideEntityManager();
//		
//		acc = em.find(Account.class, accno);
//		
//
//		return acc;
		
		//OR
		
		return EMUtil.provideEntityManager().find(Account.class, accno);
	}

}
