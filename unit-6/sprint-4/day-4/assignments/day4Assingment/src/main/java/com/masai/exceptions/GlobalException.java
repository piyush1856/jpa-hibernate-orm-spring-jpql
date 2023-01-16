package com.masai.exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalException {
	

	@ExceptionHandler(BookNotFoundException.class)
	public ResponseEntity<MyErrorDetails> bookExceptionHandler(BookNotFoundException be, WebRequest req){
		MyErrorDetails err=new MyErrorDetails(LocalDateTime.now(), be.getMessage(), req.getDescription(false));
		return new ResponseEntity<>(err,HttpStatus.BAD_REQUEST);
	}
	
	
	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<MyErrorDetails> mynotFoundHandler(NoHandlerFoundException nfe,WebRequest req) {
	MyErrorDetails err=new MyErrorDetails(LocalDateTime.now(), nfe.getMessage(), req.getDescription(false));
	return new ResponseEntity<>(err,HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyErrorDetails> bookExceptionHandler(Exception ex, WebRequest req){
		MyErrorDetails err=new MyErrorDetails(LocalDateTime.now(), ex.getMessage(), req.getDescription(false));
		return new ResponseEntity<>(err,HttpStatus.BAD_REQUEST);
	}

}
