package com.springcore.XMLBasedAutowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
//	AbstractApplicationContext context=new ClassPathXmlApplicationContext("xml-based-autowire.xml");
//	Employee employee=(Employee)context.getBean("emp");
//	
//	employee.getEmpDetails();
	
	
	ApplicationContext ctx = new ClassPathXmlApplicationContext("xml-based-autowire.xml");
			Car c = (Car) ctx.getBean("c");
			c.display();
}
}
