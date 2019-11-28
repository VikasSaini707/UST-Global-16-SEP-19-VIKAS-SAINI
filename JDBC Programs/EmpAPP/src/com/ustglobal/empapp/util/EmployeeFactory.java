package com.ustglobal.empapp.util;

import com.ustglobal.empdao.EmployeeDAO;
import com.ustglobal.empdao.EmployeeDAOImpl;

public class EmployeeFactory {
	
	private EmployeeFactory()
	{
		
	}
	
	public static EmployeeDAO getEmployeeDAO() {
		return new EmployeeDAOImpl();
	}
}
