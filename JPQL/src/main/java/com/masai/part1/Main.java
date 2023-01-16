package com.masai.part1;

import com.masai.part1.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("employee");
        EntityManager em = emf.createEntityManager();


//        Query namedQuery = em.createNamedQuery("find employee by id");
//        namedQuery.setParameter("id",2);
//        Employee employee = (Employee) namedQuery.getSingleResult();
//        System.out.println(employee);


//        Query nativeQuery = em.createNativeQuery("select * from myemployee", Employee.class);
//        List<Employee> emplist = nativeQuery.getResultList();
//
//        for(Employee e : emplist){
//            System.out.println(e);
//        }

        Query namedNativeQuery = em.createNamedQuery("getPersonByName");
        namedNativeQuery.setParameter("name","Piyush3");
        List<Employee> emplist2 = namedNativeQuery.getResultList();

        for(Employee e : emplist2){
            System.out.println(e);
        }










//        Employee emp = new Employee("Piyush3","Manager3", 2005541.00);
//        em.getTransaction().begin();
//        em.persist(emp);
//        em.getTransaction().commit();
//        em.close();


//        Query q3 = em.createQuery("select e from Employee e where e.salary BETWEEN 1000 AND 3000000");
//        List<Employee> list3 = (List<Employee>) q3.getResultList();
//        //downcast is optional just to be at safer side
//        //always prefer to type-caste
//
//        for(Employee e : list3){
//            System.out.println(e);
//        }



//        Query query = em.createQuery("select UPPER(e.name) from Employee e");
//        List<String> list = query.getResultList();
//
//        if(list.size() !=0){
//            for(String s : list){
//                System.out.println(s);
//            }
//        }else{
//            System.out.println("not found");
//        }
//
//
//        Query query1 = em.createQuery("select Max(e.salary) from Employee e");
//        Double result = (Double) query1.getSingleResult();
//
//        System.out.println(result);














    }
}