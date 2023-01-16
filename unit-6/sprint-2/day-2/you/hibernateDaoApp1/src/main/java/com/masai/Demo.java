package com.masai;

import javax.persistence.EntityManager;

import com.masai.model.Address;
import com.masai.model.Employee;
import com.masai.utility.EMUtil;

public class Demo {
	
	public static void main(String[] args) {
		
		
		EntityManager em = EMUtil.provideEntityManager();
		
		Employee emp = new Employee();
		emp.setEname("Piyush");
		emp.setSalary(85000);
//		emp.setHomeAdd(new Address("Maharastra", "Pune", "789654"));
//		emp.setOfficeAdd(new Address("Gujrat", "Surat", "986578"));

		emp.getAddresses().add(new Address("st1", "ct1", "p1"));
		emp.getAddresses().add(new Address("st2", "ct2", "p2"));
		
		em.getTransaction().begin();
		em.persist(emp);
		em.getTransaction().commit();
		System.out.println("done...");
		
		
		
		
		
		
		
		
		
		
	}

}
