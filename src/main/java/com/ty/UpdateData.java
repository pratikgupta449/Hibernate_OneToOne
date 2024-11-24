package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateData {
	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("pratik");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		 Student stud=new Student();
		 
		 Student st=em.find(Student.class, 2);
		 st.setName("nitesh");
		 st.setCourse("java");
		 st.setCollege("Qspider");
		 
		 et.begin();
		 em.persist(st);
		 et.commit();
		 
		 System.out.println("data updated");
		 
		 
		 
	}

}
