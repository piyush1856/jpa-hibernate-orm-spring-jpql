package com.masai.main;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.entites.Collage;
import com.masai.entites.Student;
import com.masai.utility.EMUtility;



public class _2GetStudentOnCollageId {
	
	public static void main(String[] args) {
		
		EntityManager em=EMUtility.provideEntityManager();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter collage ID :");
		int colID = sc.nextInt();
		
//		Collage coll =  em.find(Collage.class, colID);
//		List<Student> studList =  coll.getStudList();
//		
//		//System.out.println(studList);
//		
//		studList.forEach(s -> System.out.println(s));
//		
//		em.close();
//		sc.close();
		
		Query q = em.createQuery("select c.studList from Collage c where c.collageId =:col");
		q.setParameter("col", colID);
		
		List<Student> list = q.getResultList();
		
		list.forEach(s -> System.out.println(s));
		
		em.close();

	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
