package com.masai.tillDay3;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Student");

        EntityManager em = emf.createEntityManager();
//        Student student = em.find(Student.class, 20);
//
//        System.out.println("done");
//
//        if (student != null){
//            System.out.println(student);
//            System.out.println(student.getName());
//        }else{
//            System.out.println("Student does not exist");
//        }

        //insert
//        Student st = new Student(30,"Piyush",458);
//
//        em.getTransaction().begin();
//        em.persist(st);
//
//        em.getTransaction().commit();
//        System.out.println("done");


        //delete
//        Student st2 = em.find(Student.class,10);
//
//        if(st2 != null){
//            em.getTransaction().begin();
//            em.remove(st2);
//            em.getTransaction().commit();
//            System.out.println("done");
//        }else{
//            System.out.println("st2 not found");
//        }

     //update
        Student st3 = em.find(Student.class,20);

        if(st3 != null){
            em.getTransaction().begin();

            st3.setName("Suresh");

            em.getTransaction().commit();
            System.out.println("done");
        }else{
            System.out.println("st2 not found");
        }








        em.close();


    }
}