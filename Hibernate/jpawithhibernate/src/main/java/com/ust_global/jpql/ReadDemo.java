package com.ust_global.jpql;

import javax.persistence.Query;

import com.ust_global.jpawithhibernate.dto.ProductInfo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ReadDemo {
	
	public static void main(String[] args) {
		
		EntityManager entityManager = null;
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		entityManager = entityManagerFactory.createEntityManager();
		
		String jpql = "select pname from ProductInfo";
		Query query = entityManager.createQuery(jpql);
		
		List<String> l = query.getResultList();
		
		
		for (String pInfo : l) {
		
			System.out.println("Name == "+pInfo);
			System.out.println("~~~~~~~~~~~~~~~~~~");
		}
		
		
	}
}
