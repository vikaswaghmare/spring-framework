package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.factory.ConnectionFactory;
import com.model.StudentTo;

public class StudentDaoImpl implements StudentDao {
	String status = "";

	
	public String add(StudentTo sto) {
	try {
	Connection con = ConnectionFactory.getConnection();
	PreparedStatement pst = con.prepareStatement("select * from student where	sid = ?");
	pst.setString(1, sto.getSid());
	ResultSet rs = pst.executeQuery();
	boolean b = rs.next();
	if( b == true ) {
	status = "existed";
	}else {
	pst = con.prepareStatement("insert into student values(?,?,?)");
	pst.setString(1,sto.getSid());
	pst.setString(2, sto.getSname());
	pst.setString(3, sto.getSaddr());
	pst.executeUpdate();
	status = "success";
	}
	} catch (Exception e) {
	status = "failure";
	e.printStackTrace();
	}
	return status;
	}


	public StudentTo search(String sid) {
	StudentTo sto = null;
	try {
	Connection con = ConnectionFactory.getConnection();
	PreparedStatement pst = con.prepareStatement("select * from student where 	sid = ?");
	pst.setString(1, sid);
	ResultSet rs = pst.executeQuery();
	boolean b = rs.next();
	if(b == true) {
	sto = new StudentTo();
	sto.setSid(rs.getString("SID"));
	sto.setSname(rs.getString("SNAME"));
	sto.setSaddr(rs.getString("SADDR"));
	}else {
	sto = null;
	}
	} catch (Exception e) {
	e.printStackTrace();
	}
	return sto;
	}

	 
	public String delete(String sid) {
		try {
			Connection con = ConnectionFactory.getConnection();
			PreparedStatement pst = con.prepareStatement("select * from student where 	sid = ?");
			pst.setString(1, sid);
			ResultSet rs = pst.executeQuery();
			boolean b = rs.next();
			if (b == true) {
				pst = con.prepareStatement("delete from student where sid = ?");
				pst.setString(1, sid);
				pst.executeUpdate();
				status = "success";
			} else {
				status = "notexisted";
			}
		} catch (Exception e) {
			status = "failure";
			e.printStackTrace();
		}
		return status;
	}
}
