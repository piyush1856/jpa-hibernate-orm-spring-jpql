package com.masai;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "library")
public class Library {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookId;
    private String name;
    private String author;
    private String Publication;
    private String category;
    private int pages;
    private int price;
    @Temporal(TemporalType.TIMESTAMP)
    private Date created_timestamp;

    public Library(String name, String author, String publication, String category, int pages, int price, Date created_timestamp) {
        this.name = name;
        this.author = author;
        Publication = publication;
        this.category = category;
        this.pages = pages;
        this.price = price;
        this.created_timestamp = created_timestamp;
    }

    public int getBookId() {
        return bookId;
    }

    @Override
    public String toString() {
        return "Library{" +
                "bookId=" + bookId +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", Publication='" + Publication + '\'' +
                ", category='" + category + '\'' +
                ", pages=" + pages +
                ", price=" + price +
                ", created_timestamp=" + created_timestamp +
                '}';
    }

    public void setBookId(int bookId) {
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
        return Publication;
    }

    public void setPublication(String publication) {
        Publication = publication;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getCreated_timestamp() {
        return created_timestamp;
    }

    public void setCreated_timestamp(Date created_timestamp) {
        this.created_timestamp = created_timestamp;
    }

    public Library() {
    }
}
