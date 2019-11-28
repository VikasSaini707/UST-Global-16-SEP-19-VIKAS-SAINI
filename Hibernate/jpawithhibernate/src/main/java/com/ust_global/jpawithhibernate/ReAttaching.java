package com.ust_global.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ust_global.jpawithhibernate.dto.ProductInfo;

public class ReAttaching {

	public static void main(String[] args) {
		
		EntityManager entityManager  = null;
		EntityTransaction entityTransaction = null;

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager  = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();

			ProductInfo productInfo = entityManager.find(ProductInfo.class, 1);
			
			System.out.println(entityManager.contains(productInfo));
			//it will check whether object present or not
			
			entityManager.detach(productInfo);
			// it will detach the current passed object from DB
			System.out.println(entityManager.contains(productInfo));
			
			ProductInfo productInfo2 = entityManager.merge(productInfo);
			//merge is used to re-attach the detached object
			
			productInfo2.setName("Movie");
			System.out.println("Record Updated ");
			entityTransaction.commit();
		} catch (Exception e) {

			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();

	}
}
