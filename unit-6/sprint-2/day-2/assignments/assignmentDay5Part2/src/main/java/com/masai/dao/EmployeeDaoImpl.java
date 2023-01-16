package com.masai.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.exception.EmployeeException;
import com.masai.model.Employee;
import com.masai.utility.EMUtility;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public List<Employee> getAllEmployees() throws EmployeeException {
		
		
		List<Employee> list = null;
		
		EntityManager em = EMUtility.provideEntityManager();

		try {
			
			Query query = em.createQuery("select e from Employee e");
			list = (List<Employee>) query.getResultList();
		
		} catch (Exception e) {
			throw new EmployeeException(e.getMessage());
		}
		
		
	  em.close();
		
	  return list;
	}

	@Override
	public List<Employee> getEmployeesByAddress(String address) throws EmployeeException {


		List<Employee> list = null;
		
		EntityManager em = EMUtility.provideEntityManager();
		
		
		
		try {
			Query query = em.createQuery("select e from Employee e where e.address = : address");
			query.setParameter("address", address);
	      
			list = (List<Employee>) query.getResultList();
		
		} catch (Exception e) {
			throw new EmployeeException(e.getMessage());
		}
		
	  em.close();
		
		return list;
	}

	@Override
	public List<Employee> getAllEmployeeWithRangeSalary(int startSalary, int endSalary) throws EmployeeException {


		List<Employee> list = null;
		
		EntityManager em = EMUtility.provideEntityManager();
		
		
		try {
			Query query = em.createQuery("select e from Employee e where e.salary between :startSalary and :endSalary");
		    query.setParameter("startSalary", startSalary);
		    query.setParameter("endSalary", endSalary);
			list = (List<Employee>) query.getResultList();
		
		} catch (Exception e) {
			throw new EmployeeException(e.getMessage());
		}
		
	   em.close();
		
		return list;
	}

	@Override
	public Object[] getEmployeeNameAndSalary(int empId) throws EmployeeException {
		
		Object[] obj = new Object[2];
		
		EntityManager em = EMUtility.provideEntityManager();
		
		try {
			Query query = em.createQuery("select name,salary from Employee e where e.empId = :empId");
			query.setParameter("empId", empId);
			
			Object o = query.getSingleResult();
			obj = (Object[]) o; 
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return obj;
	}

	@Override
	public int getEmployeeSalaryById(int empId) throws EmployeeException {
		int salary = -1;
		
		EntityManager em = EMUtility.provideEntityManager();
		
		try {
			Query query = em.createQuery("select salary from Employee e where e.empId = :empId");
		    query.setParameter("empId", empId);
		    
		    salary = (int) query.getSingleResult();
		  
//			Employee emp =(Employee) query.getSingleResult();
//			
//		    salary = emp.getSalary();
		
		} catch (Exception e) {
			throw new EmployeeException(e.getMessage());
		}
		 
		 
		 
		 
		 
		return salary;
	}
	
	
	
	
	
	
	
	
	
	
	

}
