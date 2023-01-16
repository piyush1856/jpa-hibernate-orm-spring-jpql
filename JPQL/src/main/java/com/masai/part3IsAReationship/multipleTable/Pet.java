package com.masai.part3IsAReationship.multipleTable;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "pet_id")
public class Pet extends Animal{

    private String name;


    public Pet() {
    }

    public Pet(int id, String type, String name) {
        super(id, type);
        this.name = name;
    }

    public Pet(int id, String type) {
        super(id, type);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
