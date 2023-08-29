package com.stackroot.ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.stackroot.beans.HelloWorld;

public class MainApp {
	
	  
	public static void main(String[] args) {
		/*
		 * 
		 * //using Bean factory with ClassPathResource XmlBeanFactory factory = new
		 * XmlBeanFactory (new ClassPathResource("applicationContext.xml")); HelloWorld
		 * helloWorld = (HelloWorld) factory.getBean("HelloWorld");
		 * System.out.println("Using XmlBeanFactory..."+helloWorld.getMessage());
		 * 
		 * 
		 * //using ClassPathXmlApplicationContext for more than one file
		 * ////ApplicationContext context = new
		 * ClassPathXmlApplicationContext("services.xml", "daos.xml");
		 * ClassPathXmlApplicationContext context = new
		 * ClassPathXmlApplicationContext("applicationContext.xml"); HelloWorld obj =
		 * context.getBean(HelloWorld.class);
		 * System.out.println("\n getApplicationName "+context.getApplicationName()
		 * +" getDisplayName: "+context.getDisplayName());
		 * System.out.println(obj.getMessage()); context.close();
		 * 
		 * // configuring with ApplicationContext ApplicationContext applicationContext
		 * = new FileSystemXmlApplicationContext("F:\\Files\\applicationContext.xml");
		 * obj = applicationContext.getBean(HelloWorld.class);
		 * System.out.println("\n\n getBeanDefinitionNames "+applicationContext.
		 * getBeanDefinitionNames().toString()+" getDisplayName: "+applicationContext.
		 * getDisplayName());
		 * System.out.println("Using FileSystemXmlApplicationContext: "+obj.getMessage()
		 * );
		 * 
		 * BeanFactory beanFactory = applicationContext;
		 * 
		 */}
	  
	 }
