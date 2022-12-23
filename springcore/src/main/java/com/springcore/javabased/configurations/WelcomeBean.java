package com.springcore.javabased.configurations;

public class WelcomeBean {
	
	private String name;
	
	static {
		System.out.println("WelcomeBean class loading....");
	}
	
	public WelcomeBean(){
		System.out.println(" WelcomeBean Object instantiations....");
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMessage() {
		return "Wel-Come"+ name+ " to world of spring";
	}

}
