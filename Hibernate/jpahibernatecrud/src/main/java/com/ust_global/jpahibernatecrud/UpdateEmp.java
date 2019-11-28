package com.ust_global.jpahibernatecrud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ust_global.jpahibernatecrud.dto.EmployeeInfo;

public class UpdateEmp {

	public static void main(String[] args) {
		
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			
			EmployeeInfo info = entityManager.find(EmployeeInfo.class, 99);
			info.setName("Parmish");
			info.setSal(7777);
			
			System.out.println("Data Updated Successsfully");
			
			entityTransaction.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
		
	}
}
