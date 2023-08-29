package com.stackroot.beans;

public class HelloWorld {

	private String message1;
	private String message2;
	
	public HelloWorld() {}

	public HelloWorld(String message1, String message2) {
		this.message1 = message1;
		this.message2 = message2;
	}
	
	public void display() {
		System.out.println("Message1: "+message1 + " Message2: "+message2);
	}
	
	
}
