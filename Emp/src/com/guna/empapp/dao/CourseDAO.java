package com.guna.empapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.guna.empapp.model.Course;
import com.guna.empapp.util.ConnectionUtil;

public class CourseDAO {
	public void save(Course course) throws Exception {

		Connection con = ConnectionUtil.getConnection();

		PreparedStatement pst = con.prepareStatement("insert into course(name) values(?)");

		// pst.setLong(1, course.getId());
		pst.setString(1, course.getName());

		int rows = pst.executeUpdate();
		System.out.println("No. of rows inserted: " + rows);

	}

	public void delete(Course course) throws Exception {

		Connection con = ConnectionUtil.getConnection();
		PreparedStatement pst = con.prepareStatement("Delete from course where id=?");
		pst.setLong(1, course.getId());
		int row = pst.executeUpdate();
		System.out.println("Rows deleted" + row);

	}

	public void update(Course course) throws Exception {

		Connection con = ConnectionUtil.getConnection();
		PreparedStatement pst = con.prepareStatement("UPDATE course set(id,name) values(?,?)");
		pst.setLong(1, course.getId());
		pst.setString(2, course.getName());
		int row = pst.executeUpdate();
		System.out.println("No of rows updated : " + row);
	}
}
