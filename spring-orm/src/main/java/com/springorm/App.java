package com.springorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springorm.dao.StudentDao;
import com.springorm.dao.StudentDaoImpl;
import com.springorm.model.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentDao studentDao = (StudentDao) context.getBean("studentDao");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		boolean loop=true;
		System.out.println("********Standalone application for student operations: **********");
		while(loop) {
		System.out.println("Press 1 to add new student: ");
		System.out.println("Press 2 to display all student: ");
		System.out.println("Press 3 to Display student data: ");
		System.out.println("Press 4 to remove student data: ");
		System.out.println("Press 5 to update data for student: ");
		System.out.println("Press 6 to Exit: ");
		try {
			int input=Integer.parseInt(br.readLine());
			
			switch(input) {
			case 1:
				Student student=new Student();
				System.out.println("Enter Student Name: ");
				String name=br.readLine();
				System.out.println("Enter Student ID: ");
				int id=Integer.parseInt(br.readLine());
				System.out.println("Enter Student City: ");
				String city=br.readLine();
				student.setId(id);
				student.setName(name);
				student.setCity(city);
				int i=studentDao.insert(student);
				if(i!=0) {
					System.out.println("Student profile created Succcessfully..!");
				}else {
					System.out.println("Unable to create the student profile. please check the data");
				}
				System.out.println();
				break;
			case 2:
				System.out.println("Student Details:");
				for(Student s: studentDao.getStudents()) {
					System.out.println(s);
				}
				break;
			case 3:
				System.out.println("Enter Student id: ");
				int sid=Integer.parseInt(br.readLine());
				System.out.println("Student Details:");
				System.out.println(studentDao.getStudent(sid));
				break;
			case 4:
				System.out.println("Enter Student id: ");
				int did=Integer.parseInt(br.readLine());
				System.out.println(studentDao.delete(did));
				break;
			case 5:
				System.out.println("Enter Student id to update the student data");
				
				int uid=Integer.parseInt(br.readLine());
				Student std=studentDao.getStudent(uid);
				
				System.out.println("do you want to update the Student name, enter Y or N");
				String ans=br.readLine();
				if(ans.equalsIgnoreCase("Y")) {
					System.out.println("Student Name: ");
					std.setName(br.readLine());
				}
				System.out.println("do you want to update the student city, enter Y or N");
				 ans=br.readLine();
				if(ans.equalsIgnoreCase("Y")) {
					System.out.println("Student City: ");
					std.setCity(br.readLine());
				}
				System.out.println(studentDao.update(std));
				break;
			case 6:
				loop=false;
				System.out.println("Thank you..!6");
				break;
			}
			
			
			
		}catch (Exception e) {
			System.out.println("Invalid input:...!");
		}
		}
	}
}
