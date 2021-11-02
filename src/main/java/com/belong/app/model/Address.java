package com.belong.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {		
	
	@Id
	private int aid;
	private String addressLine1;
	private String city;
	private String state;
	private int zipcode;
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getCity() {
		return city;
	}	
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	@Override
	public String toString() {
		return "Address [aid=" + aid + ", addressLine1=" + addressLine1 + ", city=" + city + ", state=" + state
				+ ", zipcode=" + zipcode + "]";
	}

}
