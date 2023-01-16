package usecases;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.EMUtility;
import com.masai.entities.FullTimeInstructor;

public class _4GetFullTimeinstructorOnID {
	
	public static void main(String[] args) {
		
		
		EntityManager em = EMUtility.provideEntityManager();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Instructor id");
		int x = sc.nextInt();
		
		
		Query q = em.createQuery("from FullTimeInstructor where instructorId =:id");
		q.setParameter("id", x);
		
		FullTimeInstructor f = (FullTimeInstructor)q.getSingleResult();
		
		System.out.println(f);
		
		em.close();
		sc.close();
		
		
		
		
		
		
		
		
	}

}
