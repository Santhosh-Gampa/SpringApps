package com.stackroot.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.stackroot.autowiring.Categories;

public class Autowiredemo {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spconfig.xml");
		Categories cat = context.getBean(Categories.class);
		
		cat.show();
	}

}
