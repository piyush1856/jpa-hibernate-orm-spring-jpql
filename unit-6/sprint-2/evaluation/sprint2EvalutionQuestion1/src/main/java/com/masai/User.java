package com.masai;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	private String userName;
	private String emailId;
	
	@Embedded
	@ElementCollection(fetch = FetchType.EAGER)
	private List<PhoneNumber> phnum = new ArrayList<PhoneNumber>();

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public List<PhoneNumber> getPhnum() {
		return phnum;
	}

	public void setPhnum(List<PhoneNumber> phnum) {
		this.phnum = phnum;
	}
	
	
	
	

}
