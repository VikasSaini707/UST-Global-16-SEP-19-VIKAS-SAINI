package com.ust_global.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class DynamicUpdateQuery {
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String url = "jdbc:mysql://localhost:3307/ust_ty_db?user=root&password=root";
		
		String sql = "update emp set name=?,sal=?,gender=? where id =?";
		
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			conn = DriverManager.getConnection(url);
			
			pstmt = conn.prepareStatement(sql);
			
			String empid = args[0];
			int id = Integer.parseInt(empid);
			
			String name = args[1];
			
			String salary = args[2];
			int sal = Integer.parseInt(salary);
			
			String gender = args[3];
			
			pstmt.setInt(4, id);
			pstmt.setString(1, name);
			pstmt.setInt(2, sal);
			pstmt.setString(3, gender);
			
			int count = pstmt.executeUpdate();
			System.out.println(count +" row(S) updated");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
