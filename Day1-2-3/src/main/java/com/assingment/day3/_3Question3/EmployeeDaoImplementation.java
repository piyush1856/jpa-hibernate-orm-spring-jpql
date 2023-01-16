package com.assingment.day3._3Question3;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmployeeDaoImplementation implements EmployeeDao{
    @Override
    public void save(Employee emp) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Student");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(emp);
        em.getTransaction().commit();
        System.out.println("done");
        em.close();
        emf.close();
    }

    @Override
    public String getAddressOfEmployee(int empId) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Student");
        EntityManager em = emf.createEntityManager();
        Employee emp1 = em.find(Employee.class, empId);
        em.close();
        emf.close();
        if(emp1!=null) {
            return emp1.getAddress();
        }else {
            return null;
        }
    }

    @Override
    public String giveBonusToEmployee(int empId, int bonus) {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("Student");
        EntityManager em= emf.createEntityManager();

        Employee employee=em.find(Employee.class, empId);
        if(employee == null){
            return "Employee does not exist..";
        }
        else {
            em.getTransaction().begin();
            employee.setSalary(employee.getSalary()+bonus);
            em.getTransaction().commit();

        }

        em.close();
        emf.close();
        return "Bonus is added Successfully..";

    }

    @Override
    public boolean deleteEmployee(int empId) {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("Student");
        EntityManager em= emf.createEntityManager();

        Employee employee= em.find(Employee.class, empId);

        if(employee != null){
            em.getTransaction().begin();
            em.remove(employee);
            em.getTransaction().commit();
            em.close();
            emf.close();
            return true;
        }else {
            em.close();
            emf.close();
            return false;
        }



    }
}
