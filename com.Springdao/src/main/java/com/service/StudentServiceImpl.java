package com.service;

import com.dao.StudentDao;
import com.factory.StudentDaoFactory;
import com.model.StudentTo;

public class StudentServiceImpl implements StudentService {

	String status = "";

	
	public String addStudent(StudentTo sto) {
		StudentDao dao = StudentDaoFactory.getStudentDao();
		status = dao.add(sto);
		return status;
	}

	
	public StudentTo searchStudent(String sid) {
		StudentTo sto = null;
		StudentDao dao = StudentDaoFactory.getStudentDao();
		sto = dao.search(sid);
		return sto;
	}

	
	public String deleteStudent(String sid) {
		StudentDao dao = StudentDaoFactory.getStudentDao();
		status = dao.delete(sid);
		return status;
	}

}
