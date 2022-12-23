package com.factory;

import com.dao.StudentDao;
import com.dao.StudentDaoImpl;

public class StudentDaoFactory {
 
		private static StudentDao dao;
		static {
		dao = new StudentDaoImpl();
		}
		public static StudentDao getStudentDao() {
		return dao;
		}

}
