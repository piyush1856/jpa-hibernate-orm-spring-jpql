package com.masai;

import java.util.Objects;

public class Person {
	
	private int person_id;
	private String name ;
	private String email ;
	private int age;
	private String mobile;
	
	
	public Person(int person_id, String name, String email, int age, String mobile) {
		super();
		this.person_id = person_id;
		this.name = name;
		this.email = email;
		this.age = age;
		this.mobile = mobile;
	}


	public int getPerson_id() {
		return person_id;
	}


	public String getName() {
		return name;
	}


	public String getEmail() {
		return email;
	}


	public int getAge() {
		return age;
	}


	public String getMobile() {
		return mobile;
	}


	@Override
	public String toString() {
		return "Person [person_id=" + person_id + ", name=" + name + ", email=" + email + ", age=" + age + ", mobile="
				+ mobile + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(age, email, mobile, name, person_id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(email, other.email) && Objects.equals(mobile, other.mobile)
				&& Objects.equals(name, other.name) && person_id == other.person_id;
	}
	
	

}
