package com.assingment.day3._3Question3;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int eid;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String address;
    @Column(nullable = false)
    private int salary;

    public Employee() {
    }

    public Employee(String ename, String address, int salary) {

        this.name = ename;
        this.address = address;
        this.salary = salary;
    }

    public int getEmpId() {
        return eid;
    }

    public void setEmpId(int empId) {
        this.eid = empId;
    }

    public String getEname() {
        return name;
    }

    public void setEname(String ename) {
        this.name = ename;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + eid +
                ", ename='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }
}
