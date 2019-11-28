package com.ust_global.jdbcapp;

import java.sql.*;

import com.mysql.jdbc.Driver;


public class ExecuteInsertQuery {
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			String url = "jdbc:mysql://localhost:3307/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);
			
			String sql = "insert into emp values(9,'Pipa',456321,'M')";
			stmt = conn.createStatement();
			int count = stmt.executeUpdate(sql);
			System.out.println(count +" Row(s) Inserted");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null) {
					conn.close();
				}
				if(stmt!=null) {
					stmt.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
