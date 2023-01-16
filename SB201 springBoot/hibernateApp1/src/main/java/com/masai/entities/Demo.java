package com.masai.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Demo {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("studentUnit");
		EntityManager em = emf.createEntityManager(); //it is singleton object
		
		
		
		//getting data from DB
//		Student st = em.find(Student.class, 10);
//		if(st!=null) {
//			System.out.println(st);
//		}else {
//			System.out.println("Record not found");
//		}
//		em.close();
		
		
		
		
		
		//inserting data to Db
		Student st2 = new Student(40,500,"Krishna");
//		EntityTransaction et = em.getTransaction();
//		et.begin();
//		em.persist(st2); //the area b/w begin and commit is called transaction area
//		et.commit();
		
		//shorted code
		em.getTransaction().begin();
		em.persist(st2);
		em.getTransaction().commit();
		
		em.close();
		System.out.println("Inserted");
		
		
		
		
		//delete from database
//		Student st3= em.find(Student.class, 30);	
//		if(st3 != null){
//			em.getTransaction().begin();
//			em.remove(st3);
//			em.getTransaction().commit();
//			System.out.println("Student removed....");	
//		}else {
//			System.out.println("Student not found...");
//		}
//		em.close();
//		System.out.println("done");
		
		
		
		//update data in  database
//		Student st3=em.find(Student.class, 10); //if it returns the obj then the obj will be in p.state
//		
//		
//		if(st3 == null){
//			System.out.println("Student does not exist..");
//		}else{
//			em.getTransaction().begin();
//			st3.setMarks(st3.getMarks()+150);
//			em.getTransaction().commit();
//			System.out.println("Marks is graced...");
//		}
//		em.close();
//		System.out.println("done");
		
		
		
		
		
		
	
	}

}




























