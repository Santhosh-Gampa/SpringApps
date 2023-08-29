package com.stackroot.beans;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanClass implements InitializingBean, DisposableBean {

	private String name;
	
	@PostConstruct
	public void afterPropertiesSet() throws Exception {
		System.out.println("BeanClass: Inside afterPropertiesSet...");
	}
	
	public void init() {
		System.out.println("BeanClass: Indise init method...");
	}

	public void destroy() throws Exception {
		System.out.println("BeanClass: Inside destroy method...");
	}

	public String getName() {
		System.out.println("BeanClass: Inside getName method");
		return name;
	}

	public void setName(String name) {
		System.out.println("BeanClass: Inside setName method");
		this.name = name;
	}

}
