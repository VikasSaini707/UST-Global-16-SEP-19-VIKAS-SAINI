package com.ustglobal.empapp;

import java.util.List;
import java.util.Scanner;

import com.ustglobal.empapp.dto.EmployeeBean;
import com.ustglobal.empapp.util.EmployeeFactory;
import com.ustglobal.empdao.EmployeeDAO;
import com.ustglobal.empdao.EmployeeDAOImpl;

public class App {
	public static void main(String[] args) {

		System.out.println("Press 1 to get all employee data");
		System.out.println("Press 2 to insert employee data");
		System.out.println("Press 3 to update employee data");
		System.out.println("Press 4 to delete employee data");
		System.out.println("Press 5 to search employee data");

		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();

		switch(ch) {
		case 1 : EmployeeDAO dao = EmployeeFactory.getEmployeeDAO();
		List<EmployeeBean> result = dao.getAllEmployeeData();

		for (EmployeeBean bean : result) {
			System.out.println("Id :"+bean.getId());
			System.out.println("Name :"+bean.getName());
			System.out.println("Salary :"+bean.getSal());
			System.out.println("Gender :"+bean.getGender());
			System.out.println("~~~~~~~~~~~~~~~~~~~~");
		}

		break;
		case 2 :
			break;
		
		case 3 :
			break;
			
		case 4 :
			break;
			
		case 5 :
			
			EmployeeDAO dao1 = EmployeeFactory.getEmployeeDAO();
			System.out.println("Enter Id");
			int id = sc.nextInt();
			EmployeeBean bean = dao1.searchEmployeeData(id);
			if(bean != null) {
				System.out.println("Id :"+bean.getId());
				System.out.println("Name :"+bean.getName());
				System.out.println("Salary :"+bean.getSal());
				System.out.println("Gender :"+bean.getGender());
			}else {
				System.out.println("No data found");
			}
			
			break;
			
		}
	
			
	}
}
