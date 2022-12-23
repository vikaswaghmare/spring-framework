package com.springcore.ioc;

public class Course {
	private String courseId;
	private String courseName;
	private int courseCost;
	

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		
		this.courseId = courseId;
		System.out.println("setCourseId "+this.courseId);
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
		System.out.println("setCourseName "+this.courseName);
	}

	public int getCourseCost() {
		return courseCost;
	}

	public void setCourseCost(int courseCost) {
		this.courseCost = courseCost;
		System.out.println("setCourseCost "+this.courseCost);
	}

	public Course(String courseId, String courseName, int courseCost) {
		
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseCost = courseCost;
		System.out.println("value injected throgh construntor "+this.courseId +" "+this.courseName+" "+this.courseCost);
	}

	public void getCourseDetails() {
		System.out.println("Course Details");
		System.out.println("-------------------");
		System.out.println("Course Id :" + courseId);
		System.out.println("Course Name :" + courseName);
		System.out.println("Course Cost :" + courseCost);
	}
}
