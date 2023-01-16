package usecases;

import java.util.Scanner;

import javax.persistence.EntityManager;

import com.masai.EMUtility;
import com.masai.entities.FullTimeInstructor;
import com.masai.entities.PartTimeInstructor;

public class _1InsertFullTimeAndPartTimeInstructor {
	
	public static void main(String[] args) {
		
		EntityManager em = EMUtility.provideEntityManager();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter full time Instructor Details : ");
		
		for(int i=0;i<4;i++) {
			
			FullTimeInstructor full = new FullTimeInstructor();
			System.out.println("Enter name : ");
			full.setInstructorName(sc.nextLine());
			System.out.println("Enter email : ");
			full.setEmail(sc.nextLine());
			System.out.println("Enter salary : ");
			
			full.setSalary(sc.nextInt());
			sc.nextLine();
			
			em.getTransaction().begin();
			em.persist(full);
			em.getTransaction().commit();
			
			
		}
		
		System.out.println("Enter full Part Instructor Details : ");
		
		for(int i=0;i<4;i++) {
			
			PartTimeInstructor part = new PartTimeInstructor();
			System.out.println("Enter name : ");
			part.setInstructorName(sc.nextLine());
			System.out.println("Enter mobNo : ");
			part.setMobilenumber(sc.nextLine());
			System.out.println("Enter cost per sesion : ");
			part.setCostPerSession(sc.nextInt());
			System.out.println("Enter no. of session : ");
			part.setNoOfSession(sc.nextInt());
			sc.nextLine();
			
			
			em.getTransaction().begin();
			em.persist(part);
			em.getTransaction().commit();
			
		}
		
		
		em.close();
		sc.close();
		
		
		
		
		
		
		
		
	}

}
