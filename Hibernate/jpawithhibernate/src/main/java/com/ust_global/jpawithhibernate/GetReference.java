package com.ust_global.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ust_global.jpawithhibernate.dto.ProductInfo;

public class GetReference {
	
	public static void main(String[] args) {
		
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		entityManager = entityManagerFactory.createEntityManager();
		
		ProductInfo prodDetails = entityManager.getReference(ProductInfo.class, 4);
		//getReference will not access the DB until we try to retrieve the data.
		
		/*if data is not present in DB then find() method will give NullPointerException
		but getReference() will give EntityNOtFoundException*/
		
		System.out.println(prodDetails.getPid());
		System.out.println(prodDetails.getName());
		System.out.println(prodDetails.getQuantity());
		entityManager.close();
	}
}
