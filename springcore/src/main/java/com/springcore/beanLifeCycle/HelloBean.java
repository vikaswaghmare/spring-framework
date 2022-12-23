package com.springcore.beanLifeCycle;

import java.util.Scanner;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class HelloBean implements InitializingBean,DisposableBean {
	private String name;
	private String message;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
		System.out.println("setMessage()");
	}
	
	
	@Override
	public String toString() {
		return "HelloBean [name=" + name + ", message=" + message + "]";
	}

	//initialization and destroy method custom logic to initialize the object values.
	public void init() {
		Scanner scanner=new Scanner(System.in);
		this.name=scanner.nextLine();
		System.out.println("user defined init method...");
	}
	
	public void afterPropertiesSet() throws Exception {
		System.out.println("before setting the new value "+ message);
		message="Welcome to Spring world";
		System.out.println("afterPropertiesSet()");
		
	}
	
	public void destroy() {
		System.out.println("destroy()");
	}


	static {
		System.out.println("HelloBean class loading");
	}
	public HelloBean() {
		System.out.println("HelloBean object instantiations");
	}
	
	public String sayHello() {
		return "hello "+message;
	}
	public static HelloBean getInstance() {
		System.out.println("factory method object instantiations");
		return new HelloBean();
	}

	
}
