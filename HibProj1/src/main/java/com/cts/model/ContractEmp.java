package com.cts.model;
import com.cts.model.Employee1;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
//@DiscriminatorValue("ContEmp")
@Table(name="cons1")
public class ContractEmp extends Employee1 {
	@Column(name="duration")
	private int duration;

	public ContractEmp() {
		
	}
	public ContractEmp(long eid, String ename, double basic,int duration) {
		super(eid,ename,basic);
		this.duration = duration;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}



}
