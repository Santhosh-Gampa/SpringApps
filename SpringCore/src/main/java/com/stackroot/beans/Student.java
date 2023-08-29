package com.stackroot.beans;

import java.util.List;

public class Student {

	private int id;
	private String name;
	private Address address;
	List<Subject> subjects;
	
	public Student() {
		super();
	}

	public Student(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id = " + id + ", name = " + name + ", address = " + address + "]";
	}

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}
	
	public void displayMarks() {
		System.out.println("Student marks");
		for (Subject subject : subjects) {
			System.out.println(subject);
		}
	}
	
}
