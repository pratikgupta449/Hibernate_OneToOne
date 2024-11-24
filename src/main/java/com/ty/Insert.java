package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Insert {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("pratik");
		
		EntityManager em=emf.createEntityManager();
		
		EntityTransaction et=em.getTransaction();
		
		//create object for class student
		Student student=new Student();
		
		student.setId(1);
		student.setName("pratik");
		student.setCourse("bsc it");
		student.setCollege("ckt");
		
Student student1=new Student();
		
		student1.setId(2);
		student1.setName("mangesh");
		student1.setCourse("betech");
		student1.setCollege("TATA institute");
		
		et.begin();
		em.persist(student);
		em.persist(student1);
		
		et.commit();
		
		
	}

}
