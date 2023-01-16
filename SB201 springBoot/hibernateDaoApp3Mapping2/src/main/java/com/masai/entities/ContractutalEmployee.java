package com.masai.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
public class ContractutalEmployee extends Employee{
	
	private int noOfWorkingDays;
	private int costPerDay;
	
	public int getNoOfWorkingDays() {
		return noOfWorkingDays;
	}
	public void setNoOfWorkingDays(int noOfWorkingDays) {
		this.noOfWorkingDays = noOfWorkingDays;
	}
	public int getCostPerDay() {
		return costPerDay;
	}
	public void setCostPerDay(int costPerDay) {
		this.costPerDay = costPerDay;
	}
}
