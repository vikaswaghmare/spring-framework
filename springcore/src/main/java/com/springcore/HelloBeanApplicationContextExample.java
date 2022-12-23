package com.springcore;

public class HelloBeanApplicationContextExample {
	private String name;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String  sayHello(String name) {
		
		return "Hello "+name;
	}
}
