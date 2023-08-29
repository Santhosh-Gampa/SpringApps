package com.stackroot.beans;

public class Subject {
	int id;
	String name;
	int maxMarks;
	int obtainedMarks;
	
	public Subject() {
		super();
	}

	public Subject(int id, String name, int maxMarks, int obtainedMarks) {
		super();
		this.id = id;
		this.name = name;
		this.maxMarks = maxMarks;
		this.obtainedMarks = obtainedMarks;
	}

	@Override
	public String toString() {
		return " [id = " + id + ", Subject = " + name + ", maxMarks = " + maxMarks + ", obtainedMarks = " + obtainedMarks
				+ "]";
	}
	
	
}
