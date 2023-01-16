package com.masai.service;

import com.masai.exception.FirException;
import com.masai.model.Fir;

public interface FirService {
	
	public Fir registerFir(Fir fir, String key) throws FirException;

}
