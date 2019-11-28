package com.ust_global.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class DynamicDeleteQuery {
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String url = "jdbc:mysql://localhost:3307/ust_ty_db?user=root&password=root";
		String sql = "delete from emp where id = ?";
		
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			conn = DriverManager.getConnection(url);
			
			pstmt = conn.prepareStatement(sql);
			
			String empid = args[0];
			int id = Integer.parseInt(empid);
			pstmt.setInt(1, id);
			
			int count = pstmt.executeUpdate();
			System.out.println(count +" row(s) deleted ");
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null)
					conn.close();
				if(pstmt!=null)
					pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
