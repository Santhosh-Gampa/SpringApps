package com.stackroot.beans;

import lombok.Setter;
import lombok.ToString;

public class User {

	String name;
	Address address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", address=" + address + "]";
	}
	
}
