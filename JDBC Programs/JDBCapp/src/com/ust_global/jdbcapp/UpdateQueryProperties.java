package com.ust_global.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class UpdateQueryProperties {
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		FileReader reader = null;

		try {
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);

			Class.forName(prop.getProperty("driver-class-name"));



			//Get the connection
			String url = prop.getProperty("url");
			conn = DriverManager.getConnection(url,prop);

			//Issue SQL Query
		
			String sql = prop.getProperty("update-query");
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
			System.out.println(count +" Row(s) Updated");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null) {
					conn.close();
				}
				if(pstmt!=null) {
					pstmt.close();
				}
				if(reader!=null) {
					reader.close();
				}
			} catch (Exception e) {

				e.printStackTrace();
			}
		}
	}
}
