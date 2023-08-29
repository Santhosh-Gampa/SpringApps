package com.stackroot.autowiring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

	private int id;
	private String name;
	
	
	public int getId() {
		return id;
	}
	@Autowired(required = false)
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@Autowired
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
