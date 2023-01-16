package com.masai.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer customerId;
	@NotNull
	@Size(min = 3, max = 10 , message = "length should be between 3 and 10")
	private String customerName;
	@NotNull
	@Size(min = 3, max = 15 , message = "length should be between 3 and 15")
	private String address;
	@NotNull
	@Min(18)
	private Integer age;
	@NotNull
	@Email(message = "Pass a valid email")
	private String email;
	@NotNull
	@Size(min = 10, max = 10 , message = "length should be 10")
	private String mobile;
	@NotNull
	@Size(min = 8, max = 15 , message = "length should be between 8 and 15")
	private String password;
	
	public Customer(Integer customerId,
			@NotNull @Size(min = 3, max = 10, message = "length should be between 3 and 10") String customerName,
			@NotNull @Size(min = 3, max = 15, message = "length should be between 3 and 15") String address,
			@NotNull @Size(min = 18, message = "age should be greater than equal to 18") Integer age,
			@NotNull @Email(message = "Pass a valid email") String email,
			@NotNull @Size(min = 10, max = 10, message = "length should be 10") String mobile,
			@NotNull @Size(min = 8, max = 15, message = "length should be between 8 and 15") String password) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.address = address;
		this.age = age;
		this.email = email;
		this.mobile = mobile;
		this.password = password;
	}

	public Customer() {
		super();
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
	
	
	

}
