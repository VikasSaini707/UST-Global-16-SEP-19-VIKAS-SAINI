package com.ust_global.jpahibernatecrud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ust_global.jpahibernatecrud.dto.EmployeeInfo;

public class InsertEmp {
	
	public static void main(String[] args) {
		
		EmployeeInfo employeeInfo = new EmployeeInfo();
		employeeInfo.setId(99);
		employeeInfo.setName("Sharry");
		employeeInfo.setSal(5200);
		employeeInfo.setGender("M");
		
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			
			entityTransaction.begin();
			entityManager.persist(employeeInfo);
			System.out.println("Data Inserted Successfully");
			entityTransaction.commit();
		} catch (Exception e) {
			
			e.printStackTrace();
			entityTransaction.rollback();
			
		}
		entityManager.close();
	}
}
