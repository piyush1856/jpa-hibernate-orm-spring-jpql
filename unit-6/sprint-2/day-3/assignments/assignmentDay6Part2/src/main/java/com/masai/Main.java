package com.masai;

import java.util.Scanner;

import javax.persistence.EntityManager;

import com.masai.entities.Address;
import com.masai.entities.Customer;
import com.masai.utility.EMUtility;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		EntityManager em = EMUtility.provideEntityManager();
		
		
		for(int i=0;i<2;i++) {
			
			Customer cus = new Customer();
			
			System.out.println("Enter Customer Name:");
			cus.setName(sc.nextLine());
			System.out.println("Enter Customer Phone:");
			cus.setmobileNo(sc.nextLine());
			System.out.println("Enter Customer Email:");
			cus.setemail(sc.nextLine());
			
			System.out.println("Enter customer home and office address");
			
			for(int j=0;j<2;j++) {
				
				Address add = new Address();
				
				System.out.println("State :");
				add.setState(sc.nextLine());
				System.out.println("City :");
				add.setCity(sc.nextLine());
				System.out.println("Pincode :");
				add.setPincode(sc.nextLine());
				System.out.println("Type :");
				add.setType(sc.nextLine());
				
				cus.getEmpAddress().add(add);
				
				
				em.getTransaction().begin();
				
				em.persist(cus);
				em.getTransaction().commit();
				
				
			}
			
			
		}
		
		em.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
