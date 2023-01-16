package com.masai.main;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.entites.Collage;
import com.masai.entites.Student;
import com.masai.utility.EMUtility;

public class _3CollageDetailOnStudentRoll {
	
	public static void main(String[] args) {
		
		
		EntityManager em=EMUtility.provideEntityManager();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Roll :");
		int sroll = sc.nextInt();
		
		Query q = em.createQuery("select s.collage from Student s where s.studentRoll =:sr");
		q.setParameter("sr", sroll);
		
		Collage c = (Collage) q.getSingleResult();
		
		System.out.println(c.getCollageId());
		System.out.println(c.getCollageName());
		System.out.println(c.getCollageAddress());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
