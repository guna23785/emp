package com.guna.course.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import com.guna.emp.model.Course;
import com.guna.emp.util.ConnectionUtil;


public class CourseDeleteDAO {

	public void save(Course course) throws Exception {
		
		Connection con = ConnectionUtil.getConnection();
		PreparedStatement pst = con.prepareStatement("Delete from course where id=?");
		pst.setLong(1, course.getId());
		int row = pst.executeUpdate();
		System.out.println("Rows deleted" + row);
		
		
	}
}
