package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.exception.EmployeeException;

public class GetEmployeeSalaryByIdUsecase {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter eid");
		int eid = sc.nextInt();
		
		EmployeeDao dao = new EmployeeDaoImpl();  
		
		try {
			int salary = dao.getEmployeeSalaryById(eid);
			
			System.out.println(salary);
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
