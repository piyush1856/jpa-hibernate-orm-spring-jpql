package com.masai.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class Book {
	
	@NotNull
	private Integer bookid;
	@NotNull(message = "Book Name must be there")
	@NotBlank(message = "Book Name should not be blank")
	@NotEmpty(message = "Book Name must be there")
	private String name;
	private String author;
	@Min(value = 100, message = "Price should more then 100")
	private Integer price;
	
	
	public Book() {
		// TODO Auto-generated constructor stub
	}


	public Book(Integer bookid, String name, String author, Integer price) {
		super();
		this.bookid = bookid;
		this.name = name;
		this.author = author;
		this.price = price;
	}


	public Integer getBookid() {
		return bookid;
	}


	public void setBookid(Integer bookid) {
		this.bookid = bookid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public Integer getPrice() {
		return price;
	}


	public void setPrice(Integer price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", name=" + name + ", author=" + author + ", price=" + price + "]";
	}

}
