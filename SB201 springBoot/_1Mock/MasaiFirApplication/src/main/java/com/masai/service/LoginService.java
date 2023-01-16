package com.masai.service;

import com.masai.exception.AuthenticationException;
import com.masai.model.LogInDTO;

public interface LoginService {
	
	public String logIntoAccount(LogInDTO dto) throws AuthenticationException;
	
	public String logOutFromAccount(String key) throws AuthenticationException;

}
