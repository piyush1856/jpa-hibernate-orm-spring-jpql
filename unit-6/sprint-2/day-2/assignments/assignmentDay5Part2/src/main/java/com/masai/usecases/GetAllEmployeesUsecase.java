package com.masai.usecases;

import java.util.List;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.exception.EmployeeException;
import com.masai.model.Employee;

public class GetAllEmployeesUsecase {
	
	
	
	public static void main(String[] args) {
		
		EmployeeDao dao = new EmployeeDaoImpl();  
		
		try {
			List<Employee> list = dao.getAllEmployees();
			
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
