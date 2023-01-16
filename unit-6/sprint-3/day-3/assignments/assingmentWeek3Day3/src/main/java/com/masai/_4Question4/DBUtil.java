package com.masai._4Question4;




import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DBUtil {
	
	
    @Value("${db.driverName}")
    private String dbname;

    @Value("${db.url}")
    private String url;

    @Value("${db.username}")
    private String uname;

    @Value("${db.password}")
    private  String pass;
    
    
    public String getDbname() {
		return dbname;
	}


	public void setDbname(String dbname) {
		this.dbname = dbname;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public String getUname() {
		return uname;
	}


	public void setUname(String uname) {
		this.uname = uname;
	}


	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}


	public Connection provideConnection() {
    	
    	Connection conn = null;
    	
    	try {
			Class.forName(this.dbname);
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		}
    	
    	try {
			conn = DriverManager.getConnection(this.url,this.uname,this.pass);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
    	
    	if(conn!=null) {
    		System.out.println("Connected");
    	}
    	
    	
    	return conn;
    	
    	
    	
    	
    	
    }


}
