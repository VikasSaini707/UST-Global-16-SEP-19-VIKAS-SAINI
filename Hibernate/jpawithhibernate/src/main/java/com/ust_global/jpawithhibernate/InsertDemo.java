package com.ust_global.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ust_global.jpawithhibernate.dto.ProductInfo;

public class InsertDemo {
	
	public static void main(String[] args) {
		
		ProductInfo productInfo = new ProductInfo();
		productInfo.setPid(7);
		productInfo.setName("Watch");
		productInfo.setQuantity(10);
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(productInfo);
			
			System.out.println("Record Saved");
			entityTransaction.commit();
		} catch (Exception e) {
			
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
		
	}
}
