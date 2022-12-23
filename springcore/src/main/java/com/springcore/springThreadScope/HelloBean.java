package com.springcore.springThreadScope;

public class HelloBean {
static {
	System.out.println("class loading");
}
public HelloBean(){
	System.out.println("object initialization");
}

public String sayHello(){
	return "Method execution";
}
}
