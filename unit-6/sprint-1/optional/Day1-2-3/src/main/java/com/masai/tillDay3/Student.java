package com.masai.tillDay3;

import javax.persistence.*;

@Entity
@Table(name = "student")  //if the table name and class name is different
public class Student {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY) : ask database to generate auto
    //@GeneratedValue(strategy = GenerationType.AUTO)  //don't manually set the roll value .. it is like auto_increament // tell hibernate to generate auto
    private int roll;
    @Column(name = "marks") // if coloumn name and variable name is different
    private int marks;
    @Column(name = "name")
    //@Transient // it will ignore the feild value while persisting
    //@Enumerated // persist value as it is for enum : wheather ENUM should persisted by name or by ordinal
    private String name;
    public Student() {
        // TODO Auto-generated constructor stub
    }
    public Student(int roll, String name, int marks) {
        super();
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }
    public int getRoll() {
        return roll;
    }
    public void setRoll(int roll) {
        this.roll = roll;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }
    @Override
    public String toString() {
        return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
    }


//    @Temporal(TemporalType.DATE)
//    private  java.util.Date date;
}
