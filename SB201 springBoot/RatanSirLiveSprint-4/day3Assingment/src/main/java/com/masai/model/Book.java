package com.masai.model;

public class Book {
	
	private Integer bookId;
	private String name;
	private String author;
	private String publication;
	private String category;
	private Integer pages;
	private Integer price;
	private String autor_no;
	
	public Book(Integer bookId, String name, String author, String publication, String category, Integer pages,
			Integer price, String autor_no) {
		super();
		this.bookId = bookId;
		this.name = name;
		this.author = author;
		this.publication = publication;
		this.category = category;
		this.pages = pages;
		this.price = price;
		this.autor_no = autor_no;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
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

	public String getPublication() {
		return publication;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Integer getPages() {
		return pages;
	}

	public void setPages(Integer pages) {
		this.pages = pages;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getAutor_no() {
		return autor_no;
	}

	public void setAutor_no(String autor_no) {
		this.autor_no = autor_no;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", name=" + name + ", author=" + author + ", publication=" + publication
				+ ", category=" + category + ", pages=" + pages + ", price=" + price + ", autor_no=" + autor_no + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
