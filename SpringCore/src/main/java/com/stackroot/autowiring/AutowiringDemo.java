package com.stackroot.autowiring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class AutowiringDemo {

	public static void main(String[] args) {
		// Resource res = new ClassPathResource("spconfig.xml");
		// BeanFactory factory = new XmlBeanFactory(res);

		// Object o = factory.getBean("id1");
		// Categories wb = (Categories)o;

		// wb.show();

		ApplicationContext context = new ClassPathXmlApplicationContext("autowire.xml");
		// Categories obj = (Categories)
		// context.getBean("id1"); obj.show();

		TextEditor te = context.getBean(TextEditor.class);
		te.spellCheck();
		
		
		Student st = context.getBean(Student.class);
	}

}
