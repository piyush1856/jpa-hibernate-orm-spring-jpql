package com.masai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.EmailException;
import com.masai.exception.UserException;
import com.masai.model.Email;
import com.masai.model.User;
import com.masai.repository.EmailRepo;
import com.masai.repository.UserRepo;

@Service
public class UserEmailServiceImpl implements UserEmailService{
	
	@Autowired
	private UserRepo uRepo;
	
	@Autowired
	private EmailRepo eRepo;
	
	
	
	@Override
	public List<User> retrieveAllUser() throws UserException {
		
		List<User> list = uRepo.findAll();
		
		if(list.size() ==0) {
			throw new UserException("No user found");
		}
		
		return list;
	}

	@Override
	public User createUser(User user) throws UserException {
		
		return uRepo.save(user);
		
	}

	@Override
	public User retrieveUserById(Integer id) throws UserException {
		
		return uRepo.findById(id).orElseThrow(() -> new UserException("user not found .."));
	}
	
	@Override
	public User deleteUserById(Integer id) throws UserException {
		
		User user = uRepo.findById(id).orElseThrow(() -> new UserException("user not found .."));
		
		uRepo.delete(user);

		return user;
	}
	
	@Override
	public Email retriveEmailFromUser(Integer userId, Integer mailId) throws EmailException, UserException {
		
		User user = uRepo.findById(userId).orElseThrow(() -> new UserException("user not found .."));
		
		Email email = eRepo.findById(mailId).orElseThrow(() -> new EmailException("email not found"));
		
		return user.getEmail();

	}

	@Override
	public Email createEmailforUser(Email email, Integer userId) throws EmailException {
		
		User user = uRepo.findById(userId).orElseThrow(() -> new UserException("user not found .."));
	
		user.setEmail(email);
		email.setUser(user);
		
		eRepo.save(email);
	
		return email;
	}

	


	
	

}
