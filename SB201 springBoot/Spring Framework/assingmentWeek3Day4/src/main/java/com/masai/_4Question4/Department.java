package com.masai._4Question4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


public class Department {
	
	private int depId;
	private String deptName;
	private String location;
	
	
	public Department(int depId, String deptName, String location) {
		super();
		this.depId = depId;
		this.deptName = deptName;
		this.location = location;
	}


	@Override
	public String toString() {
		return "Department [depId=" + depId + ", deptName=" + deptName + ", location=" + location + "]";
	}
}
