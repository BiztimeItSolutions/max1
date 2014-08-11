package com.beingjavaguys.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee_personel")
public class Employee_personel {
	
	
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "empid")
	int empid;
	
	@Column(name = "mobno")
	int mobno;
	
	@Column(name = "fname")
	String fname;
	
	@Column(name = "mname")
	String mname;
	
	@Column(name = "lname")
	String lname;
	
	
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public int getMobno() {
		return mobno;
	}
	public void setMobno(int mobno) {
		this.mobno = mobno;
	}

}
