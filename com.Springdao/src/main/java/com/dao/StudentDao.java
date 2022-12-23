package com.dao;

import com.model.StudentTo;

public interface StudentDao {
	public String add(StudentTo sto);
	public StudentTo search(String sid);
	public String delete(String sid);
}
