package com.udt_global.jpawithhibernate.manytomany;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ust_global.jpawithhibernate.onetoone.VoterCard;

public class Test {

	public static void main(String[] args) {
		
		
		Course c = new Course();
		c.setCid(10);
		c.setCname("JAVA");
		
		Course c1 = new Course();
		c1.setCid(11);
		c1.setCname("SQL");
		
		ArrayList<Course> al = new ArrayList<Course>();
		al.add(c);
		al.add(c1);

		Student s1 = new Student();
		s1.setSid(1);
		s1.setSname("Laddo");
		s1.setCourses(al);
		
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(s1);
			
			System.out.println("Record Saved");
			entityTransaction.commit();
		} catch (Exception e) {
			
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}
}
