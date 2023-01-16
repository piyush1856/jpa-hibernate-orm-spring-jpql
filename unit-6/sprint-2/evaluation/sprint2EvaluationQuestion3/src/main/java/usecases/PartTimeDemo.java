package usecases;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.EMUtility;
import com.masai.entities.FullTimeInstructor;
import com.masai.entities.PartTimeInstructor;

public class PartTimeDemo {
	public static void main(String[] args) {
		
		EntityManager em = EMUtility.provideEntityManager();
		
		Query q = em.createQuery("from PartTimeInstructor");
		List<PartTimeInstructor> list = q.getResultList();
		
		list.forEach(l -> System.out.println(l));
		
		em.close();
		
		
		
		
		
		
		
		
		
		
	}

}
