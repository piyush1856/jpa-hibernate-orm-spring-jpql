package com.masai;

import java.util.Scanner;

import javax.persistence.EntityManager;

public class Main {
	
	public static void main(String[] args) {
		
		EntityManager em = EMUtility.provideEntityManager();
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<4;i++) {
			
			System.out.println("Enter name");
			String name = sc.nextLine();
			System.out.println("enter gender");
			String gen = sc.nextLine();
			System.out.println("enter sal");
			int sal = sc.nextInt();
			sc.nextLine();
			
			Employee emp = new Employee();
			emp.setName(name);
			emp.setGender(gen);
			emp.setSalary(sal);
			
			for(int j=0;j<2;j++) {
				
				System.out.println("Enter state");
				String state = sc.nextLine();
				System.out.println("Enter city");
				String city = sc.nextLine();
				System.out.println("Enter pin");
				String pin = sc.nextLine();
				System.out.println("Enter type");
				String type = sc.nextLine();
				
				emp.getEmpAddress().add(new Address(state, city, pin, type));
				
				System.out.println("enter 2nd address ..");
				
			}
			
			em.getTransaction().begin();
			em.persist(emp);
			em.getTransaction().commit();	
			
		}
		
		em.close();
		
		
		
		
		
	}

}
