package com.masai;

import javax.persistence.EntityManager;

public class _1InsertUserMain {
	
	public static void main(String[] args) {
		
		EntityManager em = EMUtility.provideEntityManager();
		
		User prateek = new User();
		prateek.setUserName("Prateek");
		prateek.setEmailId("prateek@masai.com");
		
		PhoneNumber prateekPhoneHome = new PhoneNumber(1, "987456321", PhoneType.HOME);
		PhoneNumber prateekPhoneLandline = new PhoneNumber(2, "887456321", PhoneType.LANDLINE);
		PhoneNumber prateekPhoneOffice = new PhoneNumber(3, "777456321", PhoneType.OFFICE);

		prateek.getPhnum().add(prateekPhoneHome);
		prateek.getPhnum().add(prateekPhoneLandline);
		prateek.getPhnum().add(prateekPhoneOffice);
		
		
		
		
		
		
		
		
		User nrupul = new User();
		nrupul.setUserName("nrupul");
		nrupul.setEmailId("nrupul@masai.com");
		
		PhoneNumber nrupulPhoneHome = new PhoneNumber(6, "114578964", PhoneType.HOME);		
		PhoneNumber nrupulPhoneLandline = new PhoneNumber(7, "114578964", PhoneType.LANDLINE);
		PhoneNumber nrupulPhoneLandOffice = new PhoneNumber(8, "114578964", PhoneType.OFFICE);
		
		nrupul.getPhnum().add(nrupulPhoneHome);
		nrupul.getPhnum().add(nrupulPhoneLandline);
		nrupul.getPhnum().add(nrupulPhoneLandOffice);
		
		
		em.getTransaction().begin();
		
		em.persist(prateek);
		em.persist(nrupul);
		
		em.getTransaction().commit();
		
		em.close();
		
		System.out.println("Inserted ..");
		
		
		
		
		
		
		
		
		
		
	}

}
