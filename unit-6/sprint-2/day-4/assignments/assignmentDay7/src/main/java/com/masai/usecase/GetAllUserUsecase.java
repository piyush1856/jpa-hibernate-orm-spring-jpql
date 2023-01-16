package com.masai.usecase;

import java.util.List;

import com.masai.dao.UserEmailDao;
import com.masai.dao.UserEmailDaoImplementation;
import com.masai.entities.User;
import com.masai.exception.CredentialException;

public class GetAllUserUsecase {
	
	public static void main(String[] args) {
		UserEmailDao dao = new UserEmailDaoImplementation();

		
		try {
			List<User> list = dao.getAllUser();
			if(list.size()!=0) {
				list.forEach(x -> System.out.println(x));
			}else {
				System.out.println("Users Not found..");
			}
		} catch (CredentialException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
