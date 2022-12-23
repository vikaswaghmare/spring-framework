package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.config.ApplicationConfig;
import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImpl;
import com.spring.jdbc.model.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(ApplicationConfig.class);
        
       StudentDao student= context.getBean("studentDao",StudentDaoImpl.class);
       
//     Student std=new Student(); 
//     std.setCity("Beed11");
//     std.setName("Mr.Ravi");
//     std.setId(8);

//     System.out.println(student.insert(std));
//     Student std1=new Student(); 
//     std1.setCity("Sasewadi1");
//     std1.setName("Cool1");
//     std1.setId(5);
     
    // System.out.println(student.change(std1));
     
   //  System.out.println(student.delete(6));
       
       
     for(Student s: student.getStudents()) {
    	 System.out.println(s);
     }
     System.out.println(student.getStudent(2));
    }
}
