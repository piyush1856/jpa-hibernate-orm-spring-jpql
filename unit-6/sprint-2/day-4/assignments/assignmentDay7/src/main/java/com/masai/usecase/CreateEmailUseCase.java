package com.masai.usecase;

import java.util.Scanner;

import com.masai.dao.UserEmailDao;
import com.masai.dao.UserEmailDaoImplementation;

public class CreateEmailUseCase {
	
	public static void main(String[] args) {
		
		UserEmailDao dao = new UserEmailDaoImplementation();
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter Your User Id:");
		  int num = sc.nextInt();
		  sc.nextLine();
		  System.out.println("Enter Your Email Id:");
		  String email = sc.nextLine();
		  
		  try {
			String mass = dao.createEmail(num, email);
			System.out.println(mass);
		} catch (Exception e) {
			e.getMessage();
		}
		 
			  
			 
		  
		  
		  
			sc.close();
		
		
		
		
		
		
		
		
		
		
	}

}
