package com.masai.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.entities.Email;
import com.masai.entities.User;
import com.masai.exception.CredentialException;
import com.masai.utility.EMUtility;

public class UserEmailDaoImplementation implements UserEmailDao{

	@Override
	public String createUser(User user, Email email) throws CredentialException {
		String result = "Not Created";
		
		try {
			EntityManager em = EMUtility.provideEntityManager();
				
		
			em.getTransaction().begin();
			user.setEmail(email);
			email.setUser(user);
			em.persist(user); 
			result = " Created";
			em.getTransaction().commit();
			em.close();
		}catch(Exception e) {
			throw new CredentialException(e.getMessage());
		}
		
		return result;
	}

	@Override
	public User retrieveUser(int uid) throws CredentialException {
		User user = null;
		
		try {
			EntityManager em = EMUtility.provideEntityManager();
			
			user = em.find(User.class, uid);
			
			em.close();
		
		} catch (Exception e) {
			throw new CredentialException(e.getMessage());
		}
		
		return user;
	}

	@Override
	public String deleteUser(int uid) throws CredentialException {
		
		String result = "Not deleted";
		
		
		try {
			EntityManager em = EMUtility.provideEntityManager();
			
			User user = em.find(User.class, uid);
			
			em.remove(user);
			result = "Deleted";
			
			em.close();
			return result;
		} catch (Exception e) {
			
			throw new CredentialException(result + ":" + e.getMessage());
			
		}	
	}

	@Override
	public List<User> getAllUser() throws CredentialException {
		
		try {
			EntityManager em = EMUtility.provideEntityManager();
			Query query = em.createQuery("select u from User u");
			
			List<User> list = query.getResultList();
			return list;
			
		} catch (Exception e) {
			throw new CredentialException(e.getMessage());
		}
	}

	@Override
	public Email getEmail(int userId) throws CredentialException {
		Email e = null;
		
		EntityManager em = EMUtility.provideEntityManager();
		
		try {
		User user = em.find(User.class, userId);
		
		e = user.getEmail();
	} catch (Exception e2) {
		throw new CredentialException(e2.getMessage());
	}
	return e;
	}

	@Override
	public String createEmail(int userId, String email) throws CredentialException {
		
		String result = "Email not added";
		
		EntityManager em = EMUtility.provideEntityManager();
		
		
		 User user = em.find(User.class, userId);
		 try {
			 em.getTransaction().begin();
			 user.getEmail().setEmail(email);
			 em.getTransaction().commit();
			 result = "Email Added Successfully..";
		} catch (Exception e) {
			throw new CredentialException(e.getMessage());
		}
		
		 em.close();
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}































