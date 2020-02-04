package com.cts.jpa.ui;

import javax.persistence.EntityManager;

import com.cts.jpa.util.JPAUtil;
import com.cts.model.composition.Address;
import com.cts.model.composition.Faculty;

public class CompositionEx {

	public static void main(String[] args) {
		
		Faculty f =new Faculty("Yaswanth",new Address("#76","Surabhi Nagar","Bangalore,Karnataka"));
		
		EntityManager  em=JPAUtil.getEntityManagerFactory().createEntityManager();
		
		em.getTransaction().begin();
		em.persist(f);
		em.getTransaction().commit();
		//em.flush();
		
		System.out.println("Facult Saved !");
		JPAUtil.shutdown();
	}

}
