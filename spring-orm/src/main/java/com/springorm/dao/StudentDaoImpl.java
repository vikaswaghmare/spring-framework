package com.springorm.dao;

 

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.springorm.model.Student;

public class StudentDaoImpl implements StudentDao {
		
	private HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	@Transactional
	public int insert(Student student) {
		Integer rows=(Integer)hibernateTemplate.save(student);
		return rows;
	}

 
	public Student getStudent(int studentid) {
		Student std=hibernateTemplate.get(Student.class, studentid);
		return std;
	}

	 
	public List<Student> getStudents() {
		List<Student> std=hibernateTemplate.loadAll(Student.class);
		return std;
	}

 
	@Transactional
	public String update(Student student) {
		hibernateTemplate.update(student);
		return "data updated..!";
	}

 
	@Transactional
	public String delete(int studentId) {
		Student std=hibernateTemplate.get(Student.class, studentId);
		hibernateTemplate.delete(std);
		return "data deleted...!";
	}

}
