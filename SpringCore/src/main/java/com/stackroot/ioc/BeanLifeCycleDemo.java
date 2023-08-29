package com.stackroot.ioc;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.stackroot.beans.BeanClass;


public class BeanLifeCycleDemo {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		BeanClass obj = (BeanClass) context.getBean("beanClass");
		obj.getName(); 
		context.registerShutdownHook();
			 
	}

}
