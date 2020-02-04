package com.cts.jpa.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cts.jpa.util.JPAUtil;
import com.cts.model.composition.BankAccount;
import com.cts.model.composition.Customer;

public class OnetoOneEx {

	public static void main(String[] args) {
		
		BankAccount ba=new BankAccount();
		Customer cs=new Customer("7306662927","Yaswanth",ba);
		ba.setAccno("SBIN456987");
		ba.setBalance(25000);
		ba.setCustomer(cs);
		
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction txn=em.getTransaction();
		
		txn.begin();
		em.persist(cs);
		txn.commit();
		JPAUtil.shutdown();

	}

}
