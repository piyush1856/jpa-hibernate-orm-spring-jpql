package com.masai.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int eid;
	private String ename;
	private int salary;
	
	@ElementCollection
	@Embedded
	@JoinTable(name = "empAddresses", joinColumns = @JoinColumn(name ="emp_id"))
	private List<Address> addresses = new ArrayList<>();
	
	

	
	
	
//	@Embedded
//	@AttributeOverrides({
//		
//		@AttributeOverride(name="state",column=@Column(name="HOME_STATE")),
//		@AttributeOverride(name="city",column=@Column(name="HOME_CITY")),
//		@AttributeOverride(name="pincode",column=@Column(name="HOME_PINCODE"))
//		
//	})
//	private Address homeAdd;  //here Address obj will be treated as value obj
//	
//	@Embedded
//	@AttributeOverrides({
//		
//		@AttributeOverride(name="state",column=@Column(name="OFFICE_STATE")),
//		@AttributeOverride(name="city",column=@Column(name="OFFICE_CITY")),
//		@AttributeOverride(name="pincode",column=@Column(name="OFFICE_PINCODE"))
//		
//	})
//	private Address officeAdd;
//	
//	
//	
//
//	public Employee(String ename, int salary, Address homeAdd, Address officeAdd) {
//		super();
//		this.ename = ename;
//		this.salary = salary;
//		this.homeAdd = homeAdd;
//		this.officeAdd = officeAdd;
//	}
//
//
//
//	@Override
//	public String toString() {
//		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", homeAdd=" + homeAdd
//				+ ", officeAdd=" + officeAdd + "]";
//	}
//
//
//
//	public Address getHomeAdd() {
//		return homeAdd;
//	}
//
//
//
//	public void setHomeAdd(Address homeAdd) {
//		this.homeAdd = homeAdd;
//	}
//
//
//
//	public Address getOfficeAdd() {
//		return officeAdd;
//	}
//
//
//
//	public void setOfficeAdd(Address officeAdd) {
//		this.officeAdd = officeAdd;
//	}



	public List<Address> getAddresses() {
		return addresses;
	}



	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}



	public Employee() {
		super();
	}

	

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
}
