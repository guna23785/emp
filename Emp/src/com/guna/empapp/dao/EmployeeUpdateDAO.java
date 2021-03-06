package com.guna.empapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.guna.empapp.model.Employee;
import com.guna.empapp.util.ConnectionUtil;

public class EmployeeUpdateDAO {

	public void save(Employee employee) throws Exception{
		Connection con = ConnectionUtil.getConnection();
		PreparedStatement pst = con.prepareStatement("update emp set location= ? where id=?");
		pst.setString(1, employee.getLocation());
		pst.setLong(2, employee.getId());
		int row = pst.executeUpdate();
		System.out.println("Rows updated" + row);
	}
	
}
