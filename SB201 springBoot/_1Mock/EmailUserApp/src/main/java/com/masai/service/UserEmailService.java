package com.masai.service;

import java.util.List;

import com.masai.exception.EmailException;
import com.masai.exception.UserException;
import com.masai.model.Email;
import com.masai.model.User;

public interface UserEmailService {
	
	public List<User> retrieveAllUser() throws UserException;
	
	public User createUser(User user) throws UserException;
	
	public User retrieveUserById(Integer id) throws UserException;
	
	public User deleteUserById(Integer id) throws UserException;
	
	public Email retriveEmailFromUser(Integer userId, Integer mailId) throws EmailException,UserException;
	
	public Email createEmailforUser(Email email, Integer userId) throws EmailException;
	
	

}
