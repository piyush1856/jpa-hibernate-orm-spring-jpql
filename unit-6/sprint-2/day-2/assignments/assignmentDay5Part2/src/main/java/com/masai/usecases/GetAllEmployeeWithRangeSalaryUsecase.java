package com.masai.usecases;

import java.util.List;
import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.exception.EmployeeException;
import com.masai.model.Employee;

public class GetAllEmployeeWithRangeSalaryUsecase {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start salary range");
		int start = sc.nextInt();
		System.out.println("Enter end salary range");
		int end = sc.nextInt();
		
		EmployeeDao dao = new EmployeeDaoImpl();  
		
		try {
			List<Employee> list = dao.getAllEmployeeWithRangeSalary(start, end);
			
			if(list.size() > 0) {
				list.forEach(e -> System.out.println(e));
			}else {
				System.out.println("No employee found ");
			}
			
			
			
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
