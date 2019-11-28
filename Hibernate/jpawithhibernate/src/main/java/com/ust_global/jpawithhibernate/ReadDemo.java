package com.ust_global.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ust_global.jpawithhibernate.dto.ProductInfo;

public class ReadDemo {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		ProductInfo prodDetails = entityManager.find(ProductInfo.class, 4); //find method is used to take the data from the DB
		
		System.out.println("ID --> "+prodDetails.getPid());		
		System.out.println("Name --> "+prodDetails.getName());		
		System.out.println("Quantity --> "+prodDetails.getQuantity());
		
	}
}
