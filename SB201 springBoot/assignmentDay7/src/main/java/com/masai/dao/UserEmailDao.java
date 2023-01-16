package com.masai.dao;

import java.util.List;

import com.masai.entities.Email;
import com.masai.entities.User;
import com.masai.exception.CredentialException;

public interface UserEmailDao {
	
	public List<User> getAllUser() throws CredentialException;
	
	public String createUser(User user, Email email) throws CredentialException;
	
	public User retrieveUser(int uid) throws CredentialException;
	
	public String deleteUser(int uid) throws CredentialException;
	
	public abstract Email getEmail(int userId) throws CredentialException;
	
	public abstract String createEmail(int userId, String email) throws CredentialException;
	
	
	
	

}
