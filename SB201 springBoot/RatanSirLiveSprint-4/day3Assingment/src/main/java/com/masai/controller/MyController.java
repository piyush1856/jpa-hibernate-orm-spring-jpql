package com.masai.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Book;


import jakarta.annotation.PostConstruct;


@RestController
@RequestMapping("/bookservice")
public class MyController {
	
	private List<Book> list = new ArrayList<>();
	
	@PostConstruct
	public void setUpBook() {
		
		list.add(new Book(1, "C++", "Vikash", "TMH", "Programming", 100, 1000, "g20"));
		list.add(new Book(2, "Solar System", "Yogesh", "Oxford", "Science", 200, 4000, "g26"));
		list.add(new Book(3, "JAVA", "Arjun", "Masai", "Programming", 140, 3000, "g25"));
		list.add(new Book(4, "Stock Market", "Ratan", "Dinesh Publi.", "Finance", 130, 1300, "g22"));
		list.add(new Book(5, "C", "Piyush", "Head First", "Programming", 120, 1200, "g21"));	
	}
	
	@GetMapping("/books")
	public ResponseEntity<List<Book>> getAllBook(){
		return new ResponseEntity<List<Book>>(list,HttpStatus.OK);
	}
	
	
	@GetMapping("/books/{id}")
	public ResponseEntity<Book> getBookByID(@PathVariable("id") Integer id){
		
		Book b = null;
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getBookId() == id) {
				b = list.get(i);
				return new ResponseEntity<Book>(b,HttpStatus.OK);
			}
		}
		
		throw new IllegalArgumentException("Not Found");
		
	}
	
	
	@PostMapping("/books")
	public ResponseEntity<Book>  registerBookHandler(@RequestBody Book book) {
		
		list.add(book);
		
		HttpHeaders hh = new HttpHeaders();
		hh.add("abc", "xyz");
		hh.add("Authorization", "jwtToken");
		hh.add("role", "admin");
		
		ResponseEntity<Book> re = new ResponseEntity<Book>(book,hh,HttpStatus.CREATED); // can be also used without headers(hh)
		
		return re;
	}
	
	@DeleteMapping("/books/{id}")
	public String deleteBookHandler(@PathVariable("id") Integer id) {
		String s = "Book Not Found";
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getBookId() == id) {
				list.remove(i);
				s = "Book Deleted";
			}
		}
		return s;
	}
	
	@PutMapping("/books/{id}")
	public Book updateBook(@PathVariable("id") Integer id) {
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getBookId() == id) {
				
				Book b = list.get(i);
				b.setCategory("Machine Lerning");
				b.setPrice(5000);
				return b;
			}
		}
		
		throw new IllegalArgumentException("book not found");
		
	}
	
	@PutMapping("/updateprice/{id}")
	public Book updateBookUsingRequestParameter(@PathVariable("id") Integer id, @RequestParam("price") Integer price) {
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getBookId() == id) {
				
				Book b = list.get(i);
				b.setPrice(price);
				return b;
			}
		}
		
		throw new IllegalArgumentException("book not found");
		
	}
	
	
	

}
