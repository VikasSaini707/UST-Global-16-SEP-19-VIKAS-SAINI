package com.ust_global.jpawithhibernate.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestOneToOne {

	public static void main(String[] args) {
		
		VoterCard vc = new VoterCard();
		vc.setVid(10);
		vc.setVname("Ram");
		
		Person p = new Person();
		p.setId(1);
		p.setName("Ram");
		p.setVoterCard(vc);
		
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
	//		entityManager.persist(p);
			
			VoterCard vc1 = entityManager.find(VoterCard.class, 10);
			System.out.println(vc1.getPerson().getId());
			
			System.out.println("Record Saved");
			entityTransaction.commit();
		} catch (Exception e) {
			
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}
}
