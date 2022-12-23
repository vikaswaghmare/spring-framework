package com.service;

import com.model.StudentTo;

public interface StudentService {
	public String addStudent(StudentTo sto);
	public StudentTo searchStudent(String sid);
	public String deleteStudent(String sid);

}
