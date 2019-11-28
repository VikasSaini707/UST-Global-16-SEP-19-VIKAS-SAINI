package com.ust_global.jdbcapp;

import java.sql.*;

import com.mysql.jdbc.Driver;

public class MyFirstJDBC {
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		
		try {
			
			//Load driver
			//Driver driver = new Driver();
			//DriverManager.registerDriver(driver);
			Class.forName("com.mysql.jdbc.Driver");
			
			
			
			//Get the connection
			String url = "jdbc:mysql://localhost:3307/"
					+ "ust_ty_db";
			conn = DriverManager.getConnection(url,"root","root");
			
			//Issue SQL Query
			stmt = conn.createStatement();
			String sql = "select * from emp";
			rs = stmt.executeQuery(sql);
			
			//Read the result
			while(rs.next())
			{
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int sal = rs.getInt("sal");
				String gender = rs.getString("gender");
				
				System.out.println("ID :"+id);
				System.out.println("Name :"+name);
				System.out.println("Salary :"+sal);
				System.out.println("Gender :"+gender);
				System.out.println("~~~~~~~~~~~~~~~~~~");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null) {
					conn.close();
				}
				if(stmt!=null) {
					stmt.close();
				}
				if(rs!=null) {
					rs.close();
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		
		
		
	}
}
