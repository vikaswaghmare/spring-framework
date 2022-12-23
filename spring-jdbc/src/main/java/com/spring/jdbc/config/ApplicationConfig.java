package com.spring.jdbc.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImpl;

@Configuration
public class ApplicationConfig {

	@Bean(name="jdbcTemplate")
	public JdbcTemplate getJdbcTemplate() {
		JdbcTemplate	jdbcTemplate=new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}
	
	@Bean(name="ds")
	public DataSource getDataSource() {
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc?useSSL=false");
		ds.setUsername("root");
		ds.setPassword("mysql");
		return ds;
	}
	@Bean(name="studentDao")
	public StudentDao getStudentDao() {
		StudentDaoImpl s=new StudentDaoImpl();
		s.setJdbcTemplate(getJdbcTemplate());
		return s;
	}
}
