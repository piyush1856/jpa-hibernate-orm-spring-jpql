package com.masai;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class PhoneNumber {
	
	
	private int phoneId;
	private String phoneNumber;
	private PhoneType pnoneType;
	
	public int getPhoneId() {
		return phoneId;
	}
	public void setPhoneId(int phoneId) {
		this.phoneId = phoneId;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public PhoneType getPnoneType() {
		return pnoneType;
	}
	public void setPnoneType(PhoneType pnoneType) {
		this.pnoneType = pnoneType;
	}
	public PhoneNumber() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PhoneNumber(int phoneId, String phoneNumber, PhoneType pnoneType) {
		super();
		this.phoneId = phoneId;
		this.phoneNumber = phoneNumber;
		this.pnoneType = pnoneType;
	}
	@Override
	public String toString() {
		return "PhoneNumber [phoneNumber=" + phoneNumber + "]";
	}
	
	

}
