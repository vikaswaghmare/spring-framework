package com.springorm.dao;

import java.util.List;

import com.springorm.model.Student;

public interface StudentDao {
	public int insert(Student student);
	public Student getStudent(int studentid);
	public List<Student> getStudents();
	public String update(Student student);
	public String delete(int studentId);
}
