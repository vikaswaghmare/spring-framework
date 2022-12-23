package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.model.Student;

public class StudentDaoImpl implements StudentDao {
	
	
	private JdbcTemplate jdbcTemplate;
	
 

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}



	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}



	public int insert(Student student) {
		
		String query="insert into student(id, name,city)values(?,?,?)";   
	    int row= jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
	        
		return row;
		
	}



	public int change(Student student) {
		String query="update student set name=?,city=? where id=?";   
	    int row= jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return row;
	}



	public int delete(int id) {
		String query="delete from student where id=?";   
	    int row= jdbcTemplate.update(query,id);
		return row;
	}



	public Student getStudent(int id) {
		String query="select * from student where id=?"; 
//		RowMapper<Student> rowMapper=new RowMapper() {
//
//			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
//				Student student=new Student();
//				student.setId(rs.getInt(1));
//				student.setName(rs.getString(2));
//				student.setCity(rs.getString(3));
//				return student;
//			}
//			
//		};
		RowMapper<Student> rowMapper= new RowMapperImpl();
		 Student student= jdbcTemplate.queryForObject(query, rowMapper,id);
		return student;
	}



	public List<Student> getStudents() {
		String query="select * from student"; 
		RowMapper<Student> rowMapper= new RowMapperImpl();
	 List<Student> studentList= jdbcTemplate.query(query, rowMapper);
		
		return studentList;
	}
	
}
