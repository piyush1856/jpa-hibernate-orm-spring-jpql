package com.assingment.day3._1Question1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Student");
        EntityManager em = emf.createEntityManager();

        Product p = em.find(Product.class,2);

        if(p != null){
            System.out.println(p);
        }else{
            System.out.println("No product found");
        }
        em.close();
        emf.close();




    }


}
