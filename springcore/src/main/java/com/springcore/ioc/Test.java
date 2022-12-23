package com.springcore.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
//		ApplicationContext context=new 
//				ClassPathXmlApplicationContext("ioc-di.xml");
//				Course course=(Course)context.getBean("crs");
//				course.getCourseDetails();

		
//		ApplicationContext context=new 
//				ClassPathXmlApplicationContext("ioc-di.xml");
//		Employee employee=(Employee)context.getBean("employee");
//		employee.getEmployeeDetails();
		
//		ApplicationContext context=new 
//				ClassPathXmlApplicationContext("ioc-di.xml");
//		Student student=(Student)context.getBean("student");
//		student.getStudentDeails();
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("method-injections.xml");
		Student1 std1=(Student1)context.getBean("std");
		Student1 std2=(Student1)context.getBean("std");
		System.out.println(std1);// a111
		System.out.println(std2);// a111
		System.out.println(std1.getCourse1());// b111
		System.out.println(std2.getCourse1());// b111
		
		/**
		 * if student class scope is singleton and course class scope is prototype scope. if we inject course class in student class
		 * then only one object will get in the student. this leads to voilation of spring rules. so to overcome this spring provide the method injection
		 * lookup method inject and method replacement
		 */
		
	}

}
