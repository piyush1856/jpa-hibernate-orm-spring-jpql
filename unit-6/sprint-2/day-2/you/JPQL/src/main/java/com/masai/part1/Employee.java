package com.masai.part1;

import javax.persistence.*;


@Entity
@Table(name = "myEmployee")
@NamedQuery(query = "select e from Employee e where e.eid = :id", name = "find employee by id") //you can use multiple named query
@NamedNativeQuery(query = "select * from myemployee e where e.name = :name", resultClass = Employee.class,name = "getPersonByName")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int eid;
    private String name;
    private String deg;
    private Double salary;

    public int getEid() {
        return eid;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", name='" + name + '\'' +
                ", deg='" + deg + '\'' +
                ", salary=" + salary +
                '}';
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

    public String getDeg() {
        return deg;
    }

    public void setDeg(String deg) {
        this.deg = deg;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Employee(int eid, String name, String deg, Double salary) {
        this.eid = eid;
        this.name = name;
        this.deg = deg;
        this.salary = salary;
    }

    public Employee(String name, String deg, Double salary) {
        this.name = name;
        this.deg = deg;
        this.salary = salary;
    }

    public Employee() {
    }
}
