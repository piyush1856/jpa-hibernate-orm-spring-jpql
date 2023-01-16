package com.masai.part3IsAReationship.singleTable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("1")
public class Book extends Product {

    private String author;

    public Book() {
    }

    public Book(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(String name, String author) {
        super(name);
        this.author = author;
    }

    public Book(long productID, String name, String author) {
        super(productID, name);
        this.author = author;
    }
}
