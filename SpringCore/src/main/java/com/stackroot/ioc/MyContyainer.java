package com.stackroot.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.stackroot.beans.HelloIndia;
import com.stackroot.beans.HelloWorld;
import com.stackroot.beans.MyStudent;
import com.stackroot.beans.User;

public class MyContyainer {
	
	@Autowired 
	static MyStudent std2;
	
	public static void main(String[] args) {

		//ApplicationContext context = new ClassPathXmlApplicationContext("beans2.xml");

		//User user = context.getBean(User.class);
		//System.out.println(user);
		
		/*
		 * ApplicationContext context2 = new
		 * ClassPathXmlApplicationContext("autowire.xml"); MyStudent std =
		 * context2.getBean(MyStudent.class);
		 */
		//std
		std2.setAge(11);
		std2.setName("Shiva");
		System.out.println(std2);
	}

}
