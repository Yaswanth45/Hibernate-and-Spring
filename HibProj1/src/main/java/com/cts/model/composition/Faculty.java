package com.cts.model.composition;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Faculties")
public class Faculty {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long factId;
	private String factName;
	@Embedded
	private Address address;
	
	public Faculty() {
		
	}

	public Faculty(String factName, Address address) {
		super();
		this.factName = factName;
		this.address = address;
	}

	public long getFactId() {
		return factId;
	}

	public void setFactId(long factId) {
		this.factId = factId;
	}

	public String getFactName() {
		return factName;
	}

	public void setFactName(String factName) {
		this.factName = factName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
