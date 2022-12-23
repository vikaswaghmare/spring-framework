package com.springcore.beanLifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class HellowBeanFactory {
		public String message;
		
	@Override
		public String toString() {
			return "HellowBeanFactory [message=" + message + "]";
		}
	public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
			System.out.println("setMessage()"+this.message);
		}
		
		public String helloUser(){
			 return this.message;
		}
	@PostConstruct
	public void init(){
		this.message="Cool new";
	System.out.println("postConstruct method");
	}
	@PreDestroy
	public void destroy(){
		this.message=null;
	System.out.println("preDestroy method"+this.message);
	}

	
}
