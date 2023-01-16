package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.exception.EmployeeException;

public class GetEmployeeNameAndSalaryUsecase {
	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter eid");
		int eid = sc.nextInt();
		
		EmployeeDao dao = new EmployeeDaoImpl();  
		
		try {
			Object[] obj = dao.getEmployeeNameAndSalary(eid);
			
			if(obj[0] != null && obj[1] !=null) {
				System.out.println("Name :" + obj[0]);
				System.out.println("Salary :" + obj[1]);
			}else {
				System.out.println("Not found");
			}
		
		} catch (EmployeeException e) {
			
			System.out.println("not found");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
