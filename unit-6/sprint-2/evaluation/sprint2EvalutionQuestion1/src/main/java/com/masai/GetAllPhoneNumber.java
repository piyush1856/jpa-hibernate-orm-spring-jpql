package com.masai;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public class GetAllPhoneNumber {
	 public static void main(String[] args) {
		
		 EntityManager em = EMUtility.provideEntityManager();
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter name");
		 String name = sc.nextLine();
		 
		 Query q = em.createQuery("select u.phnum from user u where u.userName = :name");
		 q.setParameter("name",name);
		 
		 List<PhoneNumber> list = q.getResultList();
		 
		 list.forEach(l -> System.out.println(l));
		 
		 
		 
		 
		 
	}
}
