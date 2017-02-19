package test.com.guna.empapp.model;

import com.guna.empapp.model.Course;
import com.guna.empapp.model.Employee;
import com.guna.empapp.model.Project;

public class TestEmp {

	public static void main(String[] args) throws Exception {

		Employee emp = new Employee();

		emp.setId(1l);
		emp.setName("guna");
		emp.setLocation("chennai");

		Project project = new Project();
		project.setId(101l);
		project.setName("MonkeyProject");
		emp.setProject(project);

		Course course = new Course();
		course.setId(1l);
		course.setName("Java");
		System.out.println(emp);

	}

}
