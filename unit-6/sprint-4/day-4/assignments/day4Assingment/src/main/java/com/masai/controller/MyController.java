package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Book;
import com.masai.service.MyService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/bookservice")
public class MyController {
	
	@Autowired
	private MyService ser;
	
	
	@GetMapping("/books")
	public ResponseEntity<List<Book>> getbooksHandler() {
	
		List<Book> li =ser.getAllBookHandler();
	
		return new ResponseEntity<List<Book>>(li,HttpStatus.OK);
	}
	
	
	@GetMapping("/book/{id}")
	public ResponseEntity<Book> getBookHandler(@PathVariable("id") Integer bookid){
	 
		Book b = ser.getBookById(bookid);
		
		return new ResponseEntity<Book>(b,HttpStatus.OK);
	}
	
	
	@PostMapping("/books")
	public ResponseEntity<Book> creteBookHandler(@Valid @RequestBody Book book){
		Book b = ser.createBook(book);
	 
		return new ResponseEntity<Book>(b,HttpStatus.ACCEPTED);
	}
	
	
	
	@DeleteMapping("/books/{id}")
	public ResponseEntity<Book> deleteBookHandler(@PathVariable("id") Integer bookid){
	   
		Book b = ser.deleteBook(bookid);
		
		return new ResponseEntity<Book>(b,HttpStatus.ACCEPTED);
	}
	
	
	@PutMapping("/books")
	public ResponseEntity<Book> updateBookHandler(@RequestBody Book book){
		Book b = ser.updateBook(book);
	
		return new ResponseEntity<Book>(b,HttpStatus.ACCEPTED);
	}
	
	
	
	

}
