package com.masai.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Email {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer mail_id;
	
	@Column(unique = true)
	private String email;
	private LocalDate created_date = LocalDate.now(); 
	

	@OneToOne(cascade = CascadeType.ALL)
	private User user;

	public Email(Integer mail_id, String email, User user) {
		super();
		this.mail_id = mail_id;
		this.email = email;
		this.created_date = LocalDate.now();
		this.user = user;
	}
	
	
	
	

}
