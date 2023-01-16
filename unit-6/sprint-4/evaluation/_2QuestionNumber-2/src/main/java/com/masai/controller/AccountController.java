package com.masai.controller;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Account;
import com.masai.model.AccountDTO;
import com.masai.service.AccountService;

import jakarta.validation.Valid;

@RestController
public class AccountController {
	
	@Autowired
	private AccountService asr;
	
	@PostMapping("/accounts")
	public ResponseEntity<Account> openAccountController(@Valid @RequestBody Account account){
		
		Account sc=asr.openAccount(account);
		return new ResponseEntity<Account>(sc, HttpStatus.CREATED);
		
	}
	
	
	@DeleteMapping("/accounts/{accno}")
	public ResponseEntity<Account> deleteAccountController(@PathVariable ("accno") Integer accno){
		
		Account ac=asr.closeAccount(accno);
		
		return new ResponseEntity<Account>(ac, HttpStatus.CREATED);
		
	}
	
	
	@PutMapping("/accounts/{accno}")
	public ResponseEntity<Account> depositAmount(@PathVariable ("accno") Integer accno, @RequestParam ("amount")Integer amount){
		
		Account ac=asr.depositAmount(accno, amount);	
		
		return new ResponseEntity<Account>(ac, HttpStatus.CREATED);
		
	}
	
	@PutMapping("/withdrawaccount/{accno}/{amount}")
	public ResponseEntity<Account> withrawnAmount(@PathVariable ("accno") Integer accno, @PathVariable ("amount")Integer amount){
		
		Account ac=asr.withdrawAmount(accno, amount);
		
		return new ResponseEntity<Account>(ac, HttpStatus.CREATED);
		
	}
	
	@PutMapping("/accountstransfer")
	public ResponseEntity<String>transferAmount(@RequestBody AccountDTO dto){
		
		String message =asr.transferAmount(dto);
		
		return new ResponseEntity<String>(message , HttpStatus.CREATED);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
