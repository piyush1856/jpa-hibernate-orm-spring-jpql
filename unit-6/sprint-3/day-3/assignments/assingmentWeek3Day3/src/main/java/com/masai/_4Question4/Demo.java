package com.masai._4Question4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.masai.config.DbConfig;

public class Demo {

	public static void main(String[] args) {
		
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(DbConfig.class);
		Connection conn = ctx.getBean(DBUtil.class).provideConnection();
		
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement("insert into student values(?,?,?)");
		
			ps.setInt(1, 10);
			ps.setString(2, "piyush");
			ps.setInt(3, 50);
		
			int x = ps.executeUpdate();
			
			if(x>0) {
				System.out.println("done");
			}else {
				System.out.println("Not done");
			}
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
