package com.stackroot.ioc;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.stackroot.beans.HelloWorld;

public class BeanPPDemo {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		HelloWorld obj = (HelloWorld) context.getBean("HelloWorld");
	    context.registerShutdownHook();
	}

}
