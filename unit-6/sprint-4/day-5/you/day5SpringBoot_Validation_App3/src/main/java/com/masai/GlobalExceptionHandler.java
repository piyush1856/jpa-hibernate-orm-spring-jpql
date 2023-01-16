package com.masai;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<MyErrorDetails> myInvalidDataExpHandler(MethodArgumentNotValidException me) {
		
		MyErrorDetails err = new MyErrorDetails();
		
		err.setTimestamp(LocalDateTime.now());
		err.setMessage("Validation Error");
		err.setDetails(me.getBindingResult().getFieldError().getDefaultMessage());
		
		
		return new ResponseEntity<MyErrorDetails>(err,HttpStatus.BAD_REQUEST);
		
		
	}
	
	
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyErrorDetails> myAnyExpHandler(Exception ie,WebRequest req){
		
		
		MyErrorDetails err = new MyErrorDetails();
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(ie.getMessage());
		err.setDetails(req.getDescription(false));
		
		
		return new ResponseEntity<MyErrorDetails>(err, HttpStatus.BAD_REQUEST);
		
	}
	
	
	

}
