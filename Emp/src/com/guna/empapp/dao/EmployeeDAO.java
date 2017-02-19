package com.guna.empapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.guna.empapp.model.Course;
import com.guna.empapp.model.Employee;
import com.guna.empapp.model.Project;
import com.guna.empapp.util.ConnectionUtil;

public class EmployeeDAO {

	public void save(Employee employee) throws Exception {
		// Step 1: Get the connection
		Connection con = ConnectionUtil.getConnection();

		// Step 2: Prepare SQL query
		PreparedStatement pst = con
				.prepareStatement("insert into emp(name,location,project_id,course_id) values(?,?,?,?)");

		// Step 3: Assign values
		pst.setString(1, employee.getName());
		pst.setString(2, employee.getLocation());
		pst.setLong(3, employee.getProject().getId());
		pst.setLong(4, employee.getCourse().getId());

		// Step 4: Execute query
		int rows = pst.executeUpdate();

		System.out.println("No. of rows inserted: " + rows);

	}

	public List<Employee> findAll() throws Exception {

		List<Employee> list = new ArrayList<>();

		// Step 1: Get the connection
		Connection con = ConnectionUtil.getConnection();

		// Step 2: Prepare SQL query
		PreparedStatement pst = con.prepareStatement("select id,name,location,project_id,course_id from emp");

		// Step 3: Execute query
		ResultSet rs = pst.executeQuery();

		while (rs.next()) {

			Project project = new Project();
			project.setId(rs.getLong("project_id"));

			Course course = new Course();
			course.setId(rs.getLong("course_id"));

			Employee employee = new Employee();
			employee.setId(rs.getLong("id"));
			employee.setName(rs.getString("name"));
			employee.setLocation(rs.getString("location"));
			employee.setProject(project);
			employee.setCourse(course);
			employee.getCourse().getId();
			list.add(employee);

		}

		return list;
	}

}
