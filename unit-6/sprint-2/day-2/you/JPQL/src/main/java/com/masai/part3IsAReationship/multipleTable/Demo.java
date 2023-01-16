package com.masai.part3IsAReationship.multipleTable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Demo {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("employee");
        EntityManager em = emf.createEntityManager();

        Pet pet = new Pet(1,"cat","Meow");

        em.getTransaction().begin();
        em.persist(pet);
        em.getTransaction().commit();
        em.close();







    }


}
