package com.springcore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App{
	
    public static void main( String[] args ) throws ClassNotFoundException
    {
    	//ApplicationContext Example
    	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContex.xml");
		HelloBeanApplicationContextExample helloBean=(HelloBeanApplicationContextExample)context.getBean("fname");
		//helloBean.setName("Mr.Cool");
		System.out.println(helloBean.sayHello(helloBean.getName()));
    	
    	//Resource Example with BeanFactory
    	
//    	Resource resource=new ClassPathResource("resource-example.xml");  // loading the XML configuration file.
//    	BeanFactory beanFactory=new XmlBeanFactory(resource); // parsing the xml file (bean definations)
//    	EmployeeResourceExample employee=  	(EmployeeResourceExample)beanFactory.getBean("employee");
//    	//it load the relation bean class and create the bean object and initialize with provide values in the config file
//    	System.out.println(employee.getEmployeeDetails());
    	
    	
    	
    }
}
