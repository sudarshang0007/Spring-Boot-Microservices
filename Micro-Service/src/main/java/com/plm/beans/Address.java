package com.plm.beans;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Embeddable
public class Address {
	
	private String city;
	private int zip;
	private String street;
	
	public Address() {
	}
	
	public Address(String city, int zip, String street) {
		super();
		this.city = city;
		this.zip = zip;
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}
	
	

}
