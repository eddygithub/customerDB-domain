package com.prudent.domain;

import java.io.Serializable;

public class Address implements Serializable{
	private static final long serialVersionUID = -262327100979266387L;
	private String streetAdr1;
	private String streetAdr2;
	private String city;
	private String state;
	private int zipCode;

	public String getStreetAdr1() {
		return streetAdr1;
	}

	public void setStreetAdr1(String streetAdr1) {
		this.streetAdr1 = streetAdr1;
	}

	public String getStreetAdr2() {
		return streetAdr2;
	}

	public void setStreetAdr2(String streetAdr2) {
		this.streetAdr2 = streetAdr2;
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

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
}
