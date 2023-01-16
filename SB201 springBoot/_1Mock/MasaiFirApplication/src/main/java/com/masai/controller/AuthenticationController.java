package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.LogInDTO;
import com.masai.service.LoginService;

import jakarta.validation.Valid;


@RestController
@RequestMapping(value = "/masaifir/user")
public class AuthenticationController {
	
	@Autowired
	private LoginService lService;
	
	@PostMapping("/login")
	public ResponseEntity<String> loginHandler(@Valid @RequestBody LogInDTO dto) {
		
		return new ResponseEntity<String>(lService.logIntoAccount(dto), HttpStatus.OK);
	}
	
	@PostMapping("/logout")
	public ResponseEntity<String> logoutHandler(@RequestParam("key") String key) {
		
		return new ResponseEntity<String>(lService.logOutFromAccount(key), HttpStatus.ACCEPTED);
	}

}
