package com.masai.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DbConnector {

    @Value("${db.driverName}")
    private String dbname;

    @Value("${db.url}")
    private String url;

    @Value("${db.username}")
    private String uname;

    @Value("${db.password}")
    private  String pass;

    public void printAll() {
        System.out.println("dbname: " + dbname);
        System.out.println("url: " + url);
        System.out.println("username: " + uname);
        System.out.println("pass: " + pass);
    }
}
