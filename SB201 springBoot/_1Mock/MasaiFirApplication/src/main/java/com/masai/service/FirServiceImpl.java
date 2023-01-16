package com.masai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.FirException;
import com.masai.exception.UserException;
import com.masai.model.Fir;
import com.masai.model.UserSession;
import com.masai.repository.FirRepo;
import com.masai.repository.SessionRepo;
import com.masai.repository.UserRepo;

@Service
public class FirServiceImpl implements FirService{
	
	@Autowired
	private SessionRepo sRepo;
	
	@Autowired
	private UserRepo uRepo;
	
	@Autowired
	private FirRepo fRepo;

	@Override
	public Fir registerFir(Fir fir, String key) throws FirException {
		
		UserSession usersession = sRepo.findByUuid(key);
		
		if(usersession == null ){
			throw new UserException("Kindly login to continue");
		}

		return fRepo.save(fir);
	}

}
