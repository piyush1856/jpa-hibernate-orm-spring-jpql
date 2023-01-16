package com.masai.usecase;

import java.util.Scanner;

import com.masai.dao.UserEmailDao;
import com.masai.dao.UserEmailDaoImplementation;
import com.masai.entities.User;
import com.masai.exception.CredentialException;

public class DeleteUserUseCase {
	
	public static void main(String[] args) {
		
		UserEmailDao dao = new UserEmailDaoImplementation();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User ID");
		try {
			
			String result = dao.deleteUser(sc.nextInt());
			
			System.out.println(result);
			
		} catch (CredentialException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
