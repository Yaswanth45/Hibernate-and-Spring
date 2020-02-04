package com.cts.jpa.ui;

import java.util.Date;

import javax.persistence.EntityManager;

import com.cts.jpa.util.JPAUtil;
import com.cts.model.Student;
import com.cts.model.StudentIdentity;

public class CompositePKEx {

	public static void main(String[] args) {
		Student s= new Student(new StudentIdentity(2,'B',5),"Yaswanth","T.K.",new Date(1998,01,24));
		
		EntityManager em= JPAUtil.getEntityManagerFactory().createEntityManager();
		
		em.getTransaction().begin();
		em.persist(s);
		em.getTransaction().commit();
		
		System.out.println("Student saved!");
		JPAUtil.shutdown();
	}

}
