package test.com.guna.emp.dao;

import java.util.List;

import com.guna.emp.dao.EmployeeDAO;
import com.guna.emp.model.Course;
import com.guna.emp.model.Employee;
import com.guna.emp.model.Project;

public class TestEmployeeDAO {

	public static void main(String[] args) throws Exception {

		Project project = new Project();
		project.setId(1l);

		Course course = new Course();
		course.setId(1l);

		Employee employee = new Employee();
		employee.setName("Janani");
		employee.setLocation("Chennai");
		employee.setProject(project);
		employee.setCourse(course);

		EmployeeDAO dao = new EmployeeDAO();
		dao.save(employee);

		List<Employee> list = dao.findAll();

		for (Employee emp : list) {
			System.out.println(emp);
		}

	}

}
