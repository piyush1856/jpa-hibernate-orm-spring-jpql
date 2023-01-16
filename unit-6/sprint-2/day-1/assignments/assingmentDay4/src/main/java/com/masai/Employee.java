package com.masai;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;



@Entity
@NamedQuery(query = "Select e from Employee e where e.empId = :empId", name = "find employee by Id")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empId;
	
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private String address;
	@Column(nullable = false)
	private int salary;
	public Employee(String name, String address, int salary) {
		super();
		this.name = name;
		this.address = address;
		this.salary = salary;
	}
	public Employee() {
		super();
	}
	
	public Employee(int empId, String name, String address, int salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
	
	
	
	

}
