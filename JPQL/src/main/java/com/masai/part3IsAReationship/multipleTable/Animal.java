package com.masai.part3IsAReationship.multipleTable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED) //change inheritance type to table per class for per table strategy
public class Animal {

    @Id
    private int id;
    private String type;

    public Animal(int id, String type) {
        this.id = id;
        this.type = type;
    }

    public Animal() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
