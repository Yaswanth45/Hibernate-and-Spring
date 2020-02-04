package com.cts.model.composition;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="BAnkAccount")
public class BankAccount {
	@Id
	private String accno;
	private double balance;
	
	@OneToOne
	@JoinColumn(name="aadhar")
	private Customer customer;
	
	public BankAccount() {
		
	}

	public BankAccount(String accno, double balance, Customer customer) {
		super();
		this.accno = accno;
		this.balance = balance;
		this.customer = customer;
	}

	public String getAccno() {
		return accno;
	}

	public void setAccno(String accno) {
		this.accno = accno;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
}
