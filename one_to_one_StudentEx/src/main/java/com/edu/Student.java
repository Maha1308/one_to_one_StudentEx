package com.edu;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="hiberstudent")
public class Student {
	@Id
	private int sid;
	private String sname;
	private String scource;
	@OneToOne
	Address ad;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getScource() {
		return scource;
	}
	public void setScource(String scource) {
		this.scource = scource;
	}
	public Address getAd() {
		return ad;
	}
	public void setAd(Address ad) {
		this.ad = ad;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", scource=" + scource + ", ad=" + ad + "]";
	}
}