package test.com.guna.emp.dao;

import com.guna.emp.dao.EmployeeDeleteDAO;
import com.guna.emp.model.Employee;

public class TestEmployeeDeleteDAO {

	public static void main(String[] args) throws Exception {
		
		Employee employee = new Employee();
		employee.setId(2l);
		
		EmployeeDeleteDAO dao = new EmployeeDeleteDAO();
		dao.save(employee);
		
	}

}
