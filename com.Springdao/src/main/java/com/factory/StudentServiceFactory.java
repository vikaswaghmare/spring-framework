package com.factory;

import com.service.StudentService;
import com.service.StudentServiceImpl;

public class StudentServiceFactory {
	private static StudentService service;
	static {
		service = new StudentServiceImpl();
	}

	public static StudentService getStudentService() {
		return service;
	}

}
