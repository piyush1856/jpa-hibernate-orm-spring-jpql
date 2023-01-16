package com.masai.service;

import java.util.List;

import com.masai.exception.FirException;
import com.masai.exception.UserException;
import com.masai.model.Fir;
import com.masai.model.User;

public interface UserService {
	
	public User registerUser(User user) throws UserException;
	
	public List<Fir> getFirList(Integer user_id, String key) throws UserException, FirException;
	
	public String deleteFir(Integer userId,Integer firId,String key) throws UserException, FirException; 
}
