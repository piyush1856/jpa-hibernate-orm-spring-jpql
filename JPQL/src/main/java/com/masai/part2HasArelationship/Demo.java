package com.masai.part2HasArelationship;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Demo {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("employee");
        EntityManager em = emf.createEntityManager();

        MyEmployee emp = new MyEmployee();
        emp.setEname("Piyush2");
        emp.setSalary(100002);
//        emp.setHomeAddress(new Address("Godda","Jharkhand","834001"));
//        emp.setOfficeAddess(new Address("Ranchi" ,"Jahrkhanad","635546"));
        emp.getAddress().add(new Address("A2","B2","12","Home"));
        emp.getAddress().add(new Address("AAa2","BAA2","122","Office"));

        em.getTransaction().begin();
        em.persist(emp);
        em.getTransaction().commit();
        em.close();






    }
}
