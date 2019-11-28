package com.ust_global.jpawithhibernate.onetomany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ust_global.jpawithhibernate.onetoone.VoterCard;

public class TestManyToOne {

	public static void main(String[] args) {
		
		PencilBox pb = new PencilBox();
		pb.setBid(10);
		pb.setBname("Nataraj");
		
		Pencil p1 = new Pencil();
		p1.setPid(1);
		p1.setColor("Red");
		p1.setPencilBox(pb);

		Pencil p2 = new Pencil();
		p2.setPid(2);
		p2.setColor("Black");
		p2.setPencilBox(pb);
		
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
//			entityManager.persist(p1);
//			entityManager.persist(p2);
			
			PencilBox pb1 = entityManager.find(PencilBox.class, 1);
			
			System.out.println("Record Saved");
			entityTransaction.commit();
		} catch (Exception e) {
			
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}
}
