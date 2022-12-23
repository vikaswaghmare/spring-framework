package com.springcore.javabased.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	static {
		System.out.println(" AppConfig class loading....");
	}
	
	public AppConfig(){
		System.out.println("AppConfig Object instantiations....");
	}
	@Bean
	public WelcomeBean welcomeBean() {
		WelcomeBean welcomeBean	=new WelcomeBean();
		welcomeBean.setName("Mr. Cool");
		return  welcomeBean;
	}
	
	@Bean
	public HelloBean helloBean() {
		HelloBean helloBean = new HelloBean();
		helloBean.setName("Mr.Cool");
		return helloBean;
	}
}
