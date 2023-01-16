package com.masai;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class LibraryDaoImpl implements LibraryDao{
    @Override
    public Library getInformationByID(int id) {
        Library l= null;

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("evaluation1");
        EntityManager em = emf.createEntityManager();

        l = em.find(Library.class,id);
        em.close();
        emf.close();

        if(l == null){
            System.out.println("No library found");
        }


        return l;

    }

    @Override
    public void createBook(Library lib) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("evaluation1");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(lib);
        em.getTransaction().commit();
        System.out.println("Done");

        em.close();
        emf.close();
    }

    @Override
    public boolean deleteBook(int id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("evaluation1");
        EntityManager em = emf.createEntityManager();

        Library l = em.find(Library.class, id);

        if (l != null) {
            em.getTransaction().begin();
            em.remove(l);
            em.getTransaction().commit();
            em.close();
            emf.close();
            return true;
        } else {
            em.close();
            emf.close();
            return false;
        }


    }

    @Override
    public void doublingPrice(int id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("evaluation1");
        EntityManager em = emf.createEntityManager();

        Library l = em.find(Library.class, id);

        if(l == null){
            System.out.println("Book not found");
        }else{
            em.getTransaction().begin();
            l.setPrice(l.getPrice()+l.getPrice());
            em.getTransaction().commit();
        }

        em.close();
        emf.close();




    }
}
