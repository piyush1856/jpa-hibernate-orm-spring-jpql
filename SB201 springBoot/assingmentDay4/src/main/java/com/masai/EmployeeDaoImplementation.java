package com.masai;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class EmployeeDaoImplementation implements EmployeeDao{

	@Override
	public Employee registerEmployee(Employee employee) throws EmployeeException {
		
		Employee emp = null;
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("studentUnit");
		EntityManager em = emf.createEntityManager();
		
		try {
			em.getTransaction().begin();
			em.persist(employee);
			em.getTransaction().commit();
		
		
//			Query q = em.createQuery("from Employee");
//			List<Employee> list = q.getResultList();
//			emp = list.get(list.size()-1);
		
			
			Query q = em.createNativeQuery("select * from employee order by empid desc limit 1",Employee.class);
			List<Employee> list = q.getResultList();
			emp = list.get(list.size()-1);
		
		}catch (Exception e) {
			throw new EmployeeException(e.getMessage());
		}
		
		
		em.close();
		return emp;
	}

	
	
	
	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException {
		
		Employee emp = null;
		EntityManager em = EMUtility.provideEntityManager();
		
		try {
			Query query = em.createNamedQuery("find employee by Id");
			query.setParameter("empId", empId);
			
		   emp = (Employee) query.getSingleResult();
			
		} catch (Exception e) {
			throw new EmployeeException(e.getMessage());
		}
		
		em.close();
		
		return emp;
	}




	@Override
	public Employee deleteEmployeeById(int empId) throws EmployeeException {
		
		
		Employee emp = null;
		EntityManager em = EMUtility.provideEntityManager();
		
		try {
			Query query = em.createNamedQuery("find employee by Id");
			query.setParameter("empId", empId);
			
		   emp = (Employee) query.getSingleResult();
		   
		   if(emp != null) {
			  
				em.getTransaction().begin();
				em.remove(emp);
				em.getTransaction().commit();
		   }else {
			   throw new EmployeeException("Employee Not found with this Id..");
		   }
			
		} catch (Exception e) {
			throw new EmployeeException(e.getMessage());
		}
		
	
		em.close();
		
		return emp;
	}




	@Override
	public Employee updateEmployee(Employee employee) throws EmployeeException {
	
		Employee emp = null;
		EntityManager em = EMUtility.provideEntityManager();
		
		try {
			Query query = em.createNamedQuery("find employee by Id");
			query.setParameter("empId", employee.getEmpId());
			
		   emp = (Employee) query.getSingleResult();
		   
		   if(emp != null) {
			  
				em.getTransaction().begin();
				emp.setAddress(employee.getAddress());
				emp.setName(employee.getName());
				emp.setSalary(employee.getSalary());
				em.getTransaction().commit();
		   }else {
			   throw new EmployeeException("Employee Not found..");
		   }
			
		} catch (Exception e) {
			throw new EmployeeException(e.getMessage());
		}
		
	
		em.close();
		
		return emp;
	}

}






























