package com.guna.course.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import com.guna.emp.model.Course;
import com.guna.emp.util.ConnectionUtil;


public class CourseDAO {
	public  void save(Course course) throws Exception {
	
	Connection con = ConnectionUtil.getConnection();
	
	PreparedStatement pst = con.prepareStatement("insert into course(name) values(?)");
	
	// pst.setLong(1, course.getId());
	pst.setString(1, course.getName());
	
	int rows = pst.executeUpdate();
	System.out.println("No. of rows inserted: " + rows);
	
	}


}
