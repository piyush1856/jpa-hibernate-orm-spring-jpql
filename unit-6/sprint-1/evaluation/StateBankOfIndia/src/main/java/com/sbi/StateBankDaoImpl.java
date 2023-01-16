package com.sbi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StateBankDaoImpl implements StateBankDao {
    @Override
    public Account findAccountById(int id) {

        Account a = null;

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("sbiUnit");
        EntityManager em = emf.createEntityManager();


        a=em.find(Account.class,id);
        em.close();
        emf.close();

        if(a == null){
            System.out.println("No Account found");
        }


        return a;


    }

    @Override
    public String saveAccount(Account account) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("sbiUnit");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(account);
        em.getTransaction().commit();
        System.out.println("Done");

        em.close();
        emf.close();








        return null;
    }

    @Override
    public String deleteAccountById(int id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("sbiUnit");
        EntityManager em = emf.createEntityManager();

        Account a = em.find(Account.class,id);

        if(a == null){
            em.close();
            emf.close();
            return "not found";
        }else{
            em.getTransaction().begin();
            em.remove(a);
            em.getTransaction().commit();
            em.close();
            emf.close();
            return "deleted";


        }





    }

    @Override
    public String withdrawFromAccount(double amount, int accountId) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("sbiUnit");
        EntityManager em = emf.createEntityManager();


        Account a = em.find(Account.class,accountId);

        if(a == null){
            em.close();
            emf.close();
            return "error found";
        }else{
            em.getTransaction().begin();
            a.setBalance(a.getBalance()-amount);
            em.getTransaction().commit();

            em.close();
            emf.close();

            return "Done";
        }





    }

    @Override
    public String depositInAccount(double amount, int accountId) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("sbiUnit");
        EntityManager em = emf.createEntityManager();


        Account a = em.find(Account.class,accountId);

        if(a == null){
            em.close();
            emf.close();
            return "error found";
        }else{
            em.getTransaction().begin();
            a.setBalance(a.getBalance()+amount);
            em.getTransaction().commit();

            em.close();
            emf.close();

            return "Done";
        }
    }
}
