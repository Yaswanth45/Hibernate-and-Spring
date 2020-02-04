package com.cts.jpa.ui;

import java.util.TreeSet;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cts.jpa.util.JPAUtil;
import com.cts.model.composition.Course;
import com.cts.model.composition.Trainee;

public class OneToManyEx {

	public static void main(String[] args) {
		Course mca =new Course(101,"MCA",new TreeSet<Trainee>());
		Course mba =new Course(102,"MBA",new TreeSet<Trainee>());
	
		mca.getTrainees().add(new Trainee(201,"Yaswanth",mca));
		mca.getTrainees().add(new Trainee(202,"Rohit",mca));
		mca.getTrainees().add(new Trainee(203,"Murali",mca));
		
		mba.getTrainees().add(new Trainee(204,"Virat",mba));
		mba.getTrainees().add(new Trainee(205,"Dhoni",mba));
		mba.getTrainees().add(new Trainee(206,"Dhanunjai",mba));
		
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction txn=em.getTransaction();
		
		txn.begin();
		em.persist(mca);
		em.persist(mba);
		txn.commit();
	}

}
