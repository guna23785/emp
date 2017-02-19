package com.guna.empapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.guna.empapp.model.Employee;
import com.guna.empapp.util.ConnectionUtil;

public class EmployeeDeleteDAO {

	public void save(Employee employee) throws Exception {
		
		Connection con = ConnectionUtil.getConnection();
		PreparedStatement pst = con.prepareStatement("delete from emp where id = ?");
		pst.setLong(1, employee.getId());
		
		int rows = pst.executeUpdate();

		System.out.println("No. of rows Deleted: " + rows);
		
	}
}
