package com.cts.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp")
public class Employee {
	@Id
	@Column(name="eid")
	private int empId;
	@Column(name ="ename",nullable=false)
	private String empname;
	private double basic;
	
	public Employee() {
		
	}

	public Employee(int empId, String empname, double basic) {
		super();
		this.empId = empId;
		this.empname = empname;
		this.basic = basic;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empname=" + empname + ", basic=" + basic + "]";
	}
	
}
