package com.springcore.springThreadScope;

import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		final ApplicationContext context=new ClassPathXmlApplicationContext("custom-scope.xml");
		HelloBean helloBean1 =(HelloBean)context.getBean("helloBean");
		HelloBean helloBean2 =(HelloBean)context.getBean("helloBean");
		
 		
		System.out.println(helloBean1.sayHello());
		System.out.println(helloBean2.sayHello());
		
		
		System.out.println("helloBean1 "+ helloBean1);
		System.out.println("helloBean2 "+ helloBean2);
		
		
		ThreadScope threadScope=(ThreadScope)context.getBean("threadScope");
		HelloBean helloBean3=(HelloBean)threadScope.remove("helloBean");
		System.out.println(helloBean3);
		
		
		Runnable runnable=new Runnable() {
			
			public void run() {
				HelloBean helloBean3 =(HelloBean)context.getBean("helloBean");
				HelloBean helloBean4 =(HelloBean)context.getBean("helloBean");
				System.out.println("helloBean3 "+ helloBean3);
				System.out.println("helloBean4 "+ helloBean4);
				
			}
		};
		Thread thread=new Thread(runnable);
		thread.start();
	}

}
