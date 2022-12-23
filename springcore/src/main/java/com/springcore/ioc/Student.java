package com.springcore.ioc;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {
	private String studentId;
	private String studentName;
	private Address studentAddress;
	private List<String> studentQuality;
	private Set<String> studentCourses;
	private Map<String, String> studentCoursesAndFaculty;
	private Properties studentCourseAndCost;

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Address getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(Address studentAddress) {
		this.studentAddress = studentAddress;
	}

	public List<String> getStudentQuality() {
		return studentQuality;
	}

	public void setStudentQuality(List<String> studentQuality) {
		this.studentQuality = studentQuality;
	}

	public Set<String> getStudentCourses() {
		return studentCourses;
	}

	public void setStudentCourses(Set<String> studentCourses) {
		this.studentCourses = studentCourses;
	}

	public Map<String, String> getStudentCoursesAndFaculty() {
		return studentCoursesAndFaculty;
	}

	public void setStudentCoursesAndFaculty(Map<String, String> studentCoursesAndFaculty) {
		this.studentCoursesAndFaculty = studentCoursesAndFaculty;
	}

	public Properties getStudentCourseAndCost() {
		return studentCourseAndCost;
	}

	public void setStudentCourseAndCost(Properties studentCourseAndCost) {
		this.studentCourseAndCost = studentCourseAndCost;
	}

	public void getStudentDeails() {
		System.out.println("Student Details");
		System.out.println("-------------------");
		System.out.println("Student Id :" + studentId);
		System.out.println("Student Name :" + studentName);
		System.out.println("Student Address :" + studentAddress);
		System.out.println("Student Qualifications :" + studentQuality);
		System.out.println("Student Courses :" + studentCourses);
		System.out.println("Student Courses And Faculty :" + studentCoursesAndFaculty);
		System.out.println("Student Courses And Cost :" + studentCourseAndCost);
	}

}
