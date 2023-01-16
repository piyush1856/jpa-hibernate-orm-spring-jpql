package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Fir;

import com.masai.service.FirService;

import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "/masaifir/user")
public class FirController {
	
	@Autowired
	private FirService fService;
	
	
	@PostMapping("/fir")
	public ResponseEntity<Fir> registerUser(@Valid @RequestBody Fir fir, String key){
		
		return new ResponseEntity<Fir>(fService.registerFir(fir, key), HttpStatus.CREATED);
	}

}
