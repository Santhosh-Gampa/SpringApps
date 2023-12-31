package com.stackroot.beans;

public class Address {
	private String city;
	private String state;
	private String country;
	
	public Address() {
		super();
	}

	public Address(String city, String state, String country) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
	}

	@Override
	public String toString() {
		return " [city=" + city + ", state=" + state + ", country=" + country + "]";
	}
	
}
