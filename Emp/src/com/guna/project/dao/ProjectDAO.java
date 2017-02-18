package com.guna.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import com.guna.emp.model.Project;
import com.guna.emp.util.ConnectionUtil;

public class ProjectDAO {
	
	public void save(Project project) throws Exception{
		
	Connection con = ConnectionUtil.getConnection();
	
	PreparedStatement pst = con.prepareStatement("insert into project(name) values(?)");
	pst.setString(1, project.getName());
	
	int rows = pst.executeUpdate();
	System.out.println("No. of rows inserted: " + rows);
	
		
	}
}
