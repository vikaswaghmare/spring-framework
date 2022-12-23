package com.springcore.beanLifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
//		AbstractApplicationContext context=new ClassPathXmlApplicationContext("bean-life-cycle.xml");
//		HelloBean helloBean=(HelloBean)context.getBean("wel");
//		
//		System.out.println(helloBean.sayHello());
//		context.registerShutdownHook();
		
		
//		AbstractApplicationContext context=new ClassPathXmlApplicationContext("bean-life-cycle.xml");
//		HellowBeanFactory hellowBeanFactory=(HellowBeanFactory)context.getBean("wel");
//		
//		System.out.println(hellowBeanFactory.helloUser());
//		context.registerShutdownHook();
		
		
 
//			AbstractApplicationContext context=new ClassPathXmlApplicationContext("common-init.xml");
//			Hello bean2=(Hello)context.getBean("hello");
//			Welcome bean1=(Welcome)context.getBean("welcome");
//			
//			
//			context.registerShutdownHook();
		 
		AbstractApplicationContext context=new 
				ClassPathXmlApplicationContext("bean-life-cycle.xml");
				Customer cust=(Customer)context.getBean("cust");
				cust.getCustomerDetails();
				context.registerShutdownHook();
	}

}
