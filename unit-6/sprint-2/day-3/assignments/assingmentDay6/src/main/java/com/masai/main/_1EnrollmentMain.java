package com.masai.main;

import java.util.Scanner;

import javax.persistence.EntityManager;

import com.masai.entites.Collage;
import com.masai.entites.Student;
import com.masai.utility.EMUtility;

public class _1EnrollmentMain {
	
	public static void main(String[] args) {
		
		
		EntityManager em = EMUtility.provideEntityManager();
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<2;i++) {
			
			Collage col = new Collage();
			
			System.out.println("Emter Collage Name :");
			String cname = sc.nextLine();
			System.out.println("Enter Collage Address :");
			String cadd = sc.nextLine();
			
			col.setCollageName(cname);
			col.setCollageAddress(cadd);
			
			for(int j=0;j<4;j++) {
				
				Student stud = new Student();
				
				System.out.println("Emter Student Name :");
				String sname = sc.nextLine();
				System.out.println("Enter Student mobile :");
				String smob = sc.nextLine();
				System.out.println("Enter Student email :");
				String semail = sc.nextLine();
				
				stud.setStudentName(sname);
				stud.setMobileNumber(smob);
				stud.setEmail(semail);
				
				stud.setCollage(col);
				
				col.getStudList().add(stud);
				
				em.getTransaction().begin();
				em.persist(col);
				em.getTransaction().commit();	
				
				
			}
			
			
			
			
		}
		
		em.close();
		
		

		
	}

}
