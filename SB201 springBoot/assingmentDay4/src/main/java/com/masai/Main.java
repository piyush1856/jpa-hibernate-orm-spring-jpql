package com.masai;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
	
	public static void main(String[] args) {
		EmployeeDao dao = new EmployeeDaoImplementation();
		
//		Employee e = new Employee("Ritesh", "Ranchi",845578);
//		
//		
//		try {
//			Employee emp = dao.registerEmployee(e);
//			System.out.println(emp);
//		} catch (EmployeeException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		
		
		
		
		
//		try {
//			Employee emp=dao.getEmployeeById(2);
//			System.out.println(emp);
//		} catch (EmployeeException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
		
//		try {
//			Employee emp = dao.deleteEmployeeById(10);
//			System.out.println(emp);
//		} catch (EmployeeException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		
		
		Employee e = new Employee(11,"Ritesh", "Bengaluru",845578);
		
		try {
			Employee emp = dao.updateEmployee(e);
			System.out.println(emp);
		} catch (EmployeeException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}

}
