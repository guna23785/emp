package test.com.guna.empapp.dao;

import java.util.List;

import com.guna.empapp.dao.EmployeeDAO;
import com.guna.empapp.model.Course;
import com.guna.empapp.model.Employee;
import com.guna.empapp.model.Project;

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
