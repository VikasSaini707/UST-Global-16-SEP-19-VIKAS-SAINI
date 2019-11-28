package com.ust_global.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ExecuteUpdateQuery {
	public static void main(String[] args) {

		
		Connection conn = null;
		Statement stmt = null;
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			String url ="jdbc:mysql://localhost:3307/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);
			
			String sql = "update emp set sal=82500 where id=1";
			stmt  = conn.createStatement();
			int count  = stmt.executeUpdate(sql);
			System.out.println(count +" Row(s) Updated");
			
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
