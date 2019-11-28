package com.ust_global.jpahibernatecrud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ust_global.jpahibernatecrud.dto.EmployeeInfo;

public class ReadEmp {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		EmployeeInfo info = entityManager.find(EmployeeInfo.class, 99);
		
		System.out.println("Id = "+info.getId());
		System.out.println("Name = "+info.getName());
		System.out.println("Salary = "+info.getSal());
		System.out.println("Gender = "+info.getGender());
		
	}
}
