package com.cts.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.cts.model.Employee1;
@Entity
//@DiscriminatorValue("mang")
@Table(name="mnps1")
public class ManagerEmp extends Employee1{
	@Column(name="allowance")
	private Double allowance;
	public ManagerEmp() {
		
	}


	public ManagerEmp(long eid, String ename, double basic,double allowance) {
		super(eid,ename,basic);
		this.allowance = allowance;
	}

	



	public Double getAllowance() {
		return allowance;
	}

	public void setAllowance(Double allowance) {
		this.allowance = allowance;
	}
	

}
