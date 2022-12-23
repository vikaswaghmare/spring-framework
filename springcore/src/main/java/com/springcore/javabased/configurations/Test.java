package com.springcore.javabased.configurations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
	
	ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
	
	String[] beanNames=context.getBeanDefinitionNames();
	for(String s:beanNames) {
		System.out.println(s);
	}
	
		WelcomeBean welcomeBean= (WelcomeBean)context.getBean("welcomeBean");
		System.out.println(welcomeBean.getMessage()+"  "+welcomeBean);
		WelcomeBean welcomeBean1= (WelcomeBean)context.getBean(WelcomeBean.class);
		System.out.println(welcomeBean.getMessage()+"  "+welcomeBean1);
		
		HelloBean helloBean=(HelloBean)context.getBean(HelloBean.class);
		System.out.println(helloBean.sayHello()+"  "+helloBean);
		

	}

}
