package com.guna.course.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.guna.emp.model.Course;
import com.guna.emp.util.ConnectionUtil;

public class CourseUpdateDAO {

	public void save(Course course) throws Exception{
		
		Connection con = ConnectionUtil.getConnection();
		PreparedStatement pst = con.prepareStatement("UPDATE course set(id,name) values(?,?)");
		pst.setLong(1, course.getId());
		pst.setString(2, course.getName());
		int row = pst.executeUpdate();
		System.out.println("No of rows updated : " + row);
	}
}