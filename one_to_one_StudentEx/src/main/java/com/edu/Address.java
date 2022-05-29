package com.edu;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="hiberaddress")
public class Address {
	@Id
	private int No;
	private String Street;
	private String city;
	private String District;
	private String State;
	public int getNo() {
		return No;
	}
	public void setNo(int no) {
		No = no;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return District;
	}
	public void setDistrict(String district) {
		District = district;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	@Override
	public String toString() {
		return "Address [No=" + No + ", Street=" + Street + ", city=" + city + ", District=" + District + ", State="
				+ State + "]";
	}
}
	