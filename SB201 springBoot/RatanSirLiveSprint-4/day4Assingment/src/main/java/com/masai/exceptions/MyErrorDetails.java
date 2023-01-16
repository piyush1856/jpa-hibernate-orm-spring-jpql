package com.masai.exceptions;

import java.time.LocalDateTime;

public class MyErrorDetails {
	
	private LocalDateTime responseTime;
	private String massage;
	private String description;
	
	
	public MyErrorDetails() {
		// TODO Auto-generated constructor stub
	}


	public MyErrorDetails(LocalDateTime locallocalDateTimeTime, String massage, String description) {
		super();
		this.responseTime = locallocalDateTimeTime;
		this.massage = massage;
		this.description = description;
	}


	public LocalDateTime getResponseTime() {
		return responseTime;
	}


	public void setResponseTime(LocalDateTime responseTime) {
		this.responseTime = responseTime;
	}


	public String getMassage() {
		return massage;
	}


	public void setMassage(String massage) {
		this.massage = massage;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}

}
