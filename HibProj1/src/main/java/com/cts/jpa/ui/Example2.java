package com.cts.jpa.ui;

import javax.persistence.EntityManager;

import org.abego.treelayout.internal.util.Contract;

import com.cts.jpa.util.JPAUtil;
import com.cts.model.ContractEmp;
import com.cts.model.Employee1;
import com.cts.model.ManagerEmp;

public class Example2 {

	public static void main(String[] args) {
		Employee1 e =new Employee1(101,"Yaswanth",25000);
		ManagerEmp m=new ManagerEmp(102,"Sarah",35000,9500);
		ContractEmp c=new ContractEmp(103,"Murali",45200,11);
		
		EntityManager em= JPAUtil.getEntityManagerFactory().createEntityManager();
		
		em.getTransaction().begin();
		em.persist(e);
		em.persist(m);
		em.persist(c);
		em.getTransaction().commit();
		
		System.out.println("All Records Saved!");
		JPAUtil.shutdown();

	}

}
