package com.sbi;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "stateBankDB")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String email;
    private String address;
    private Double balance;
    @Temporal(TemporalType.DATE)
    private Date date;

    public Account() {
    }

    @Override
    public String toString() {
        return "SBI{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", balance=" + balance +
                ", date=" + date +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Account(String email, String address, Double balance, Date date) {
        this.email = email;
        this.address = address;
        this.balance = balance;
        this.date = date;
    }
}
