package com.masai.part3IsAReationship.singleTable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("2")
public class Pen extends Product {

    private String color;

    public Pen(long productID, String name, String color) {
        super(productID, name);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public Pen() {
    }

    public void setColor(String color) {
        this.color = color;
    }
}
