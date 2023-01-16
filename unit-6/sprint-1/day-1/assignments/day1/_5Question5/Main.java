package com.assingment.day1._5Question5;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee(30,"Atal","Pluto");

           Main m = new Main();
        try {
            System.out.println(m.registerEmployee(emp));
        } catch (EmployeeException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(m.getEmployeeById(30));

        }catch (EmployeeException e){
            System.out.println(e.getMessage());
        }


    }
    public String registerEmployee(Employee employee) throws EmployeeException{

        String res = "Not done";
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Student");
        EntityManager em = emf.createEntityManager();


        try {
            em.getTransaction().begin();
            em.persist(employee);
            em.getTransaction().commit();
            res = "done";
        }catch (RuntimeException e){
            throw new EmployeeException(e.getMessage());
        }

        em.close();

        return res;
    }

    public Employee getEmployeeById(int empId) throws EmployeeException {
        Employee emp2 = null;

        try {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("Student");
            EntityManager em = emf.createEntityManager();
            emp2 = em.find(Employee.class,empId);

        }catch (RuntimeException e){
            throw  new EmployeeException(e.getMessage());
        }

        if (emp2 == null){
            throw  new EmployeeException("Employee Not found");
        }
        return emp2;

    }



}
