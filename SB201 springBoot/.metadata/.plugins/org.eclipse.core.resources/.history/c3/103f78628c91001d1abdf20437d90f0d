package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Fir;
import com.masai.model.User;
import com.masai.service.UserService;

import jakarta.persistence.criteria.CriteriaBuilder.In;
import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "/masaifir/user")
public class UserController {
	
	@Autowired
	private UserService uService;
	
	
	@PostMapping("/register")
	public ResponseEntity<User> registerUser(@Valid @RequestBody User user){
		
		return new ResponseEntity<User>(uService.registerUser(user), HttpStatus.CREATED);
	}
	
	@GetMapping("/{userId}/fir/")
	public ResponseEntity<List<Fir>> getallFirListByAUser(@Valid @PathVariable("userId") Integer user_id, String key){
		
		return new ResponseEntity<List<Fir>>(uService.getFirList(user_id, key), HttpStatus.OK);	
	}
	
	@DeleteMapping("/{userId}/fir/{firid}")
	public ResponseEntity<String> deleteFir(@Valid @PathVariable("userId") Integer userid, @PathVariable("firid") Integer firid, String key ){
		
		return new ResponseEntity<String>(uService.deleteFir(userid, firid, key), HttpStatus.OK);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
