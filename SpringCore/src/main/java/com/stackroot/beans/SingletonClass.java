package com.stackroot.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class SingletonClass /* implements InitializingBean, DisposableBean */ {

	String message;

	public String getMessage() {
		System.out.println("inside getter  "+message);
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	/*
	 * @Override public void afterPropertiesSet() throws Exception {
	 * System.out.println("inside afterpropertiesset method..."); }
	 * 
	 * @Override public void destroy() throws Exception {
	 * System.out.println("inside detroy method...");
	 * 
	 * }
	 */
	
}
