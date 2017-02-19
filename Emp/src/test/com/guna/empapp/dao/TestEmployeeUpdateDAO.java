package test.com.guna.emp.dao;

import com.guna.emp.dao.EmployeeUpdateDAO;
import com.guna.emp.model.Employee;

public class TestEmployeeUpdateDAO {

	public static void main(String[] args) throws Exception {
		
		Employee employee = new Employee();
		employee.setLocation("Dubai");
		employee.setId(3l);
		
		EmployeeUpdateDAO dao = new EmployeeUpdateDAO();
		dao.save(employee);

	}

}
