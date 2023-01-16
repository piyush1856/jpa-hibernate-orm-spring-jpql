package com.masai.usecase;

import java.util.Scanner;

import com.masai.dao.UserEmailDao;
import com.masai.dao.UserEmailDaoImplementation;
import com.masai.entities.Email;
import com.masai.exception.CredentialException;

public class GetEmailUseCase {
	
	public static void main(String[] args) {
		
		UserEmailDao dao = new UserEmailDaoImplementation();
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter Your User Id:");
		int id = sc.nextInt();
		sc.nextLine();
		Email email;
		try {
			email = dao.getEmail(id);
			if(email != null) {
				System.out.println(email.toString());
			}else {
				System.out.println("Id Not found...");
			}
		} catch (CredentialException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		
	}

}
