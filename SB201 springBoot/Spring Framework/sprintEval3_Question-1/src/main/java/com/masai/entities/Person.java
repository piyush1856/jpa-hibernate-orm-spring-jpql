package com.masai.entities;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int person_id;
	private String name ;
	private String email ;
	private String mobile;
	
	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "persons")
	private Set<Gym> gyms = new HashSet<>();

	
	public int getPerson_id() {
		return person_id;
	}

	public void setPerson_id(int person_id) {
		this.person_id = person_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Set<Gym> getGyms() {
		return gyms;
	}

	public void setGyms(Set<Gym> gyms) {
		this.gyms = gyms;
	}
	
	
}
