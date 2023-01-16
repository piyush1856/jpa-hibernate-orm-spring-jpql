package com.masai;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.masai.Entities.Department;
import com.masai.Entities.Employee;
import com.masai.utility.EMUtil;

public class Demo2 {
	
	public static void main(String[] args) {
		
		EntityManager em = EMUtil.provideEntityManager();
		
		//adding one more employee
		
//		Department dept = em.find(Department.class, 7);
//		
//		Employee emp = new Employee("Mukesh", 45697);
//		
//		em.getTransaction().begin();
//		dept.getEmps().add(emp);
//		em.getTransaction().commit();
//		
//		em.close();
		
		
		
		//getting all the employee from a department name;
		
//		String jpql= "select emps from Department where dname='Finance'";
//		
//		Query q= em.createQuery(jpql);
//		
//		List<Employee> allemps= q.getResultList();
//	
//		System.out.println(allemps);
		
		
//		String jpql= "from Department where dname= :dn";
//		
//		TypedQuery<Department> q= em.createQuery(jpql,Department.class);
//		q.setParameter("dn", "Finance");
//		
//		Department dept = q.getSingleResult();
//	
//		System.out.println(dept.getLocation());
//		dept.getEmps().forEach(e -> System.out.println(e));;
//		
//		
//	
		
		
	}

}
