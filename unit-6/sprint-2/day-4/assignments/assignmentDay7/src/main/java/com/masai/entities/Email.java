package com.masai.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Email {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int mail_id;
	private String email;
	@Temporal(TemporalType.DATE)
	private Date created_date;
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "email")
	private User user;

	public int getMail_id() {
		return mail_id;
	}

	public void setMail_id(int mail_id) {
		this.mail_id = mail_id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Email [mail_id=" + mail_id + ", email=" + email + ", created_date=" + created_date + ", user=" + this.user.getName()
				+ "]";
	}
	
	

}
