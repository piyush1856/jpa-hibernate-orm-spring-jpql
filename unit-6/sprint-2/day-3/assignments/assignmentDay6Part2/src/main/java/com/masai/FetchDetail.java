package com.masai;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.entities.Address;
import com.masai.entities.Customer;
import com.masai.utility.EMUtility;

public class FetchDetail {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		EntityManager em = EMUtility.provideEntityManager();
		
		
		System.out.println("Enter customer ID :");
		int cid = sc.nextInt();
		
		Query q = em.createQuery("from Customer c where c.cid =:cid");
		q.setParameter("cid", cid);
		
		Customer cus = (Customer) q.getSingleResult();
		
		Set<Address> address = cus.getEmpAddress();
		
		address.forEach(a -> System.out.println(a));
		
		
//		List<Customer> cusList = q.getResultList();
//		
//		for(Customer c : cusList) {
//			
//			Set<Address> addList = c.getEmpAddress();
//			
//			for(Address a : addList) {
//				System.out.println(a);
//			}
//			
//		}
		
				
		em.close();
		
		
		
		
		
		
		
		
		
	}

}
