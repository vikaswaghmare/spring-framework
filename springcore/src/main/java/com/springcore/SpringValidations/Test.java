package com.springcore.SpringValidations;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.validation.MapBindingResult;
import org.springframework.validation.ObjectError;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("validation.xml");
		Employee emp = (Employee) context.getBean("emp");
		emp.getEmpDetails();
		EmployeeValidator empValidator = (EmployeeValidator) context.getBean("empValidator");
		Map<String, String> map = new HashMap<String, String>();
		MapBindingResult results = new MapBindingResult(map, "com.springcore.SpringValidations.Employee");
		empValidator.validate(emp, results);
		List<ObjectError> list = results.getAllErrors();
		for (ObjectError e : list) {
			System.out.println(e.getDefaultMessage());
		}
	}
}
