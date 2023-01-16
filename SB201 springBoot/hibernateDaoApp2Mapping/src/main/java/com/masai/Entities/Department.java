package com.masai.Entities;



import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Department {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int deptId;
	private String dname;
	private String location;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Employee> emps = new ArrayList<>();
	
	
	public List<Employee> getEmps() {
		return emps;
	}

	public void setEmps(List<Employee> emps) {
		this.emps = emps;
	}

	public Department(String dname, String location) {
		super();
		this.dname = dname;
		this.location = location;
	
	}

	public Department() {
		super();
	}

	public Department(int deptId, String dname, String location) {
		super();
		this.deptId = deptId;
		this.dname = dname;
		this.location = location;
		
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", dname=" + dname + ", location=" + location + ", emps=" + emps + "]";
	}	
	
}
