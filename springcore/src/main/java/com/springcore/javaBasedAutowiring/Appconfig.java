package com.springcore.javaBasedAutowiring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class Appconfig {
	
	DriverManagerDataSource dataSource=null;
	
	@Bean
	public DriverManagerDataSource dataSource() {
		try {
			
		
		dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/TEST");
		dataSource.setUsername("root");
		dataSource.setPassword("mysql");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return dataSource;
	}


	@Bean
	public AccountDao accountDao() {
		return new AccountDaoImpl();
	}
	
	@Bean
	public AccountService accountService() {
		return new AccountServiceImpl();
	}
}
