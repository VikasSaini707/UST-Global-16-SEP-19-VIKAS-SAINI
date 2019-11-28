package com.ust_global.jdbcapp;

import java.sql.*;

import com.mysql.jdbc.Driver;


public class ExecuteInsertQuery2 {
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			String url = "jdbc:mysql://localhost:3307/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);
			
			String sql = "insert into emp values(?,?,?,?)";
			pstmt = conn.prepareStatement(sql);

			String empid = args[0];
			int id = Integer.parseInt(empid);
			pstmt.setInt(1, id);
			
			String name = args[1];
			pstmt.setString(2, name);
			
			String empsal = args[2];
			int sal = Integer.parseInt(empsal);
			pstmt.setInt(3, sal);
			
			String gender = args[3];
			pstmt.setString(4, gender);
			
			
			int count = pstmt.executeUpdate();
			System.out.println(count +" Row(S) inserted");
			
			
			
			
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null) {
					conn.close();
				}
				if(pstmt!=null) {
					pstmt.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
