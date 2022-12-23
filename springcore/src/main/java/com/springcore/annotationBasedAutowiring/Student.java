package com.springcore.annotationBasedAutowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Student {
	private String sid;
	private String sname;
	private Course scourse;
	
	@Autowired
	public Student(String sid, String sname, 
	 @Qualifier("adv_Java")Course scourse){
		this.sid=sid;
		this.sname=sname;
		this.scourse=scourse;
	}

//	public String getSid() {
//	return sid;
//	}
//	public void setSid(String sid) {
//	this.sid = sid;
//	}
//	public String getSname() {
//	return sname;
//	}
//	public void setSname(String sname) {
//	this.sname = sname;
//	}
//	public Course getScourse() {
//	return scourse;
//	}
//	 
//	@Autowired
//	@Qualifier(value = "Core_Java")
//	public void setScourse(Course scourse) {
//		this.scourse = scourse;
//	}
	public void getStudentDetails(){
	System.out.println("Student Details");
	System.out.println("--------------------");
	System.out.println("Student Id :"+sid);
	System.out.println("Student Name :"+sname);
	System.out.println("Course Details");
	System.out.println("----------------");
	System.out.println("Course Id :"+scourse.getCid());
	System.out.println("Course Name :"+scourse.getCname());
	System.out.println("Course Cost :"+scourse.getCcost());
	}
	}

