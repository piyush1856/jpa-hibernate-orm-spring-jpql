package com.masai.usecase;

import java.util.Date;
import java.util.Scanner;

import com.masai.dao.UserEmailDao;
import com.masai.dao.UserEmailDaoImplementation;
import com.masai.entities.Email;
import com.masai.entities.User;
import com.masai.exception.CredentialException;

public class CreateUserUsecase {
	
	public static void main(String[] args) {
		
		UserEmailDao dao = new UserEmailDaoImplementation();
		
		Scanner sc = new Scanner(System.in);
		
		User user = new User();
		System.out.println("Enter Name");
		user.setName(sc.nextLine());
		System.out.println("Enter Phone");
		user.setPhoneNO(sc.nextLine());
		System.out.println("Enter DOB");
		user.setDateOfBirth(sc.nextLine());
	
		Email email = new Email();
		email.setCreated_date(new Date());
		System.out.println("Enter Email");
		email.setEmail(sc.nextLine());
		
		try {
			String result = dao.createUser(user,email);
			
			System.out.println(result);
		} catch (CredentialException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
			
		
	}
}
