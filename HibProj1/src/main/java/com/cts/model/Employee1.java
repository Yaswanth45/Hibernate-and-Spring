package com.cts.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
/*@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@Table(name="Employee1")
@DiscriminatorColumn(name="emp_type", discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue("emp")*/
//@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@Inheritance(strategy=InheritanceType.JOINED)
@Table(name="Emp2")
public class Employee1 {
	@Id
	@Column(name="eid")
	private long eid;
	@Column(name="ename")
	private String ename;
	@Column(name="sal")
	private double basic;
	
	public Employee1() {
		
	}

	public Employee1(long eid, String ename, double basic) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.basic = basic;
	}

	public long getEid() {
		return eid;
	}

	public void setEid(long eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}

}
