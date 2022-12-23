package com.springcore.annotationBasedAutowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new 
				ClassPathXmlApplicationContext("annotation-based-autowiring.xml");
				Student std=(Student)context.getBean("std");
				std.getStudentDetails();

	}
}
