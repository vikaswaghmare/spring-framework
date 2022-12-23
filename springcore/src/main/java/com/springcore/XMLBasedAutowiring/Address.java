package com.springcore.XMLBasedAutowiring;

public class Address {
	private String hno;
	private String street;
	private String city;
	private String state;
	public String getHno() {
		return hno;
	}
	public void setHno(String hno) {
		this.hno = hno;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
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
	
	public Address(String hno, String street, String city, String state) {
		super();
		this.hno = hno;
		this.street = street;
		this.city = city;
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [hno=" + hno + ", street=" + street + ", city=" + city + ", state=" + state + "]";
	}
	public void setState(String state) {
		this.state = state;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
