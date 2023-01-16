package com.masai.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int cid;
	private String name;
	private String mobileNo;
	private String email;
	
	
	@ElementCollection(fetch = FetchType.EAGER)
	@Embedded
	private Set<Address> empAddress = new HashSet<>();
	
	public Customer(String name, String mobileNo, String email, Set<Address> empAddress) {
		super();
		this.name = name;
		this.mobileNo = mobileNo;
		this.email = email;
		this.empAddress = empAddress;
	}
	public int getcid() {
		return cid;
	}
	public void setcid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getmobileNo() {
		return mobileNo;
	}
	public void setmobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email = email;
	}
	public Set<Address> getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(Set<Address> empAddress) {
		this.empAddress = empAddress;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", mobileNo=" + mobileNo + ", email=" + email + ", empAddress="
				+ empAddress + "]";
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
