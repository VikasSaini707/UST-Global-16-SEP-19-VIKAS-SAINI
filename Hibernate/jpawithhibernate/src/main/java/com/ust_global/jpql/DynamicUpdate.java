package com.ust_global.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicUpdate {

	public static void main(String[] args) {
		
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();

			String jpql = "update ProductInfo set pname=:name where pid=:id";
			Query query = entityManager.createQuery(jpql);
			
			query.setParameter("name", "Book");
			query.setParameter("id", 2);
			
			int count = query.executeUpdate();
			System.out.println(count+" Row(s) Updated");

			entityTransaction.commit();
		} catch (Exception e) {

			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();

	}
}
