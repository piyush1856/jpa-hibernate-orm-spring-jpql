package com.masai.entities;

import javax.persistence.Entity;

@Entity
public class PartTimeInstructor extends Instructor {

	private int noOfSession;
	private int costPerSession;
	private String mobilenumber;
	
	
	public int getNoOfSession() {
		return noOfSession;
	}
	public void setNoOfSession(int noOfSession) {
		this.noOfSession = noOfSession;
	}
	public int getCostPerSession() {
		return costPerSession;
	}
	public void setCostPerSession(int costPerSession) {
		this.costPerSession = costPerSession;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	@Override
	public String toString() {
		return "PartTimeInstructor [noOfSession=" + noOfSession + ", costPerSession=" + costPerSession
				+ ", mobilenumber=" + mobilenumber + ", Id=" + getInstructorId()
				+ ", Name=" + getInstructorName() + "]";
	}
	
	
	
	
}
