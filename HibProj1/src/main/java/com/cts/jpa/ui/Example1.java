package com.cts.jpa.ui;

import java.util.Scanner;

import javax.persistence.EntityManager;

import com.cts.jpa.util.JPAUtil;
import com.cts.model.Employee;

public class Example1 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		Employee e=new Employee();
		System.out.println("EmpId :");
		e.setEmpId(scan.nextInt());
		System.out.println("EName :");
		e.setEmpname(scan.next());
		System.out.println("Basic :");
		e.setBasic(scan.nextDouble());
		
		EntityManager em= JPAUtil.getEntityManagerFactory().createEntityManager();
		
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
		
		System.out.println("Emp saved!");
		JPAUtil.shutdown();
		scan.close();
	}

}
