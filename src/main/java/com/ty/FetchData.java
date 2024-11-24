package com.ty;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchData {
	public static void main(String[] args) {
		 
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("pratik");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		//to fetch data we use find() method which accept 2 argument
		//1st arg is classname, 2nd arg is id(which record to be fetch)
		
		
		// this method is used to find single records.
		Student st=em.find(Student.class, 1);
		
		System.out.println(st.getId());
		System.out.println(st.getName());
		System.out.println(st.getCourse());
		System.out.println(st.getCollege());
		
		System.out.println("=======================================");

		
		
		//fetch the multiple records in single time.
		//create query
		et.begin();
		Query query=em.createQuery("select s from Student s");
		
		List<Student> stud=query.getResultList();
		
		et.commit();
		//use for each loop to print
		for(Student s:stud) {
			System.out.println(s.getId());
			System.out.println(s.getName());
			System.out.println(s.getCourse());
			System.out.println(s.getCollege());
			System.out.println("=+++++++++++++++++++++++++++++++++");
		}

	}
}
