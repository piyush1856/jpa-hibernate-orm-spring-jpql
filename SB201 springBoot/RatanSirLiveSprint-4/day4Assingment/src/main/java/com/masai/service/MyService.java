package com.masai.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.masai.exceptions.BookNotFoundException;
import com.masai.model.Book;

import jakarta.annotation.PostConstruct;

@Service
public class MyService {
	
	private List<Book> list = new ArrayList<>();
	
	
	@PostConstruct
	public void addAllbooks() {
		Book b1 = new Book(1,"C++","Ratna",1400);
		Book b2 = new Book(2,"JAVA","Arjun",5000);
		Book b3 = new Book(3,"DSA","Ankush",1820);
		list.add(b3);
		list.add(b2);
		list.add(b1);
	}
	
	public List<Book> getAllBookHandler(){
		return list;
	}
	
	
	public Book getBookById(Integer bookid) {
		
		return 	list.stream()
				.filter(x -> x.getBookid()==bookid)
				.findAny().orElseThrow(() -> new BookNotFoundException("Book Not found with Id :"+bookid));
			
	}
	

	public Book createBook(Book book) {
		Optional<Book> opt = list.stream()
				             .filter(x -> x.getBookid()==book.getBookid())
				             .findAny();
		
		if(opt.isPresent()) {
			throw new BookNotFoundException("Book Already Present");	
		}else {
			list.add(book);
			return book;
		}
		
	}
	
	
	public Book updateBook(Book book) {
		Optional<Book> opt = list.stream()
							 .filter(x -> x.getBookid()==book.getBookid())
							 .findAny();
		
		if(opt.isPresent()) {
			Book b = opt.get();
			for(int i = 0;i<list.size();i++) {
				if(list.get(i).getBookid() == b.getBookid()) {
					list.set(i, book);
				}
			}
			return book;
		}else {
			throw new BookNotFoundException("Book not found");	
			
		}
		
	}
	
	
	 public Book deleteBook(Integer bookid) {
	    	Book b = null;
	    	for(int i=0;i<list.size();i++) {
	    		if(list.get(i).getBookid() == bookid) {
	    			b = list.get(i);
	    			list.remove(i);
	    		}
	    	}
	    	if(b != null) {
	    		return b;
	    	}else {
	    		throw new BookNotFoundException("Book not found with id : "+bookid);
	    	}
	    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
