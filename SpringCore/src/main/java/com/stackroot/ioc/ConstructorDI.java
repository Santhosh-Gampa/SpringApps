package com.stackroot.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.stackroot.beans.Student;

public class ConstructorDI {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student emp = (Student) applicationContext.getBean("student");
		System.out.println(emp);
		emp.displayMarks();
	
	}

}
