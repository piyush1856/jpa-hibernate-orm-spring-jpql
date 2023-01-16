package com.assingment.day1._5Question5;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    private int eid;
    private String name;
    private String address;

    public Employee(int eid, String name, String address) {
        this.eid = eid;
        this.name = name;
        this.address = address;
    }

    public Employee() {
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
