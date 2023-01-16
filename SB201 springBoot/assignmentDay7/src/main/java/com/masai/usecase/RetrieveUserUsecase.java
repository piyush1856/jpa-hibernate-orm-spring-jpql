package com.masai.usecase;

import java.util.Scanner;

import com.masai.dao.UserEmailDao;
import com.masai.dao.UserEmailDaoImplementation;
import com.masai.entities.User;
import com.masai.exception.CredentialException;

public class RetrieveUserUsecase {

	public static void main(String[] args) {
		
		UserEmailDao dao = new UserEmailDaoImplementation();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User ID");
		try {
			
			User user = dao.retrieveUser(sc.nextInt());
			if(user != null) {
				System.out.println(user);
			}else {
				throw new CredentialException("No user Found");
			}
			
		} catch (CredentialException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
