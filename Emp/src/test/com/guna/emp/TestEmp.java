package test.com.guna.emp;

import com.guna.emp.Emp;
import com.guna.emp.Project;

public class TestEmp {

	public static void main(String[] args) {
		Emp emp = new Emp();
		
		emp.setId("1");
		emp.setName("guna");
		emp.setLocation("chennai");
		
		Project project = new Project();
		project.setId("101");
		project.setName("MonkeyProject");
		emp.setProject(project);
		System.out.println(emp);

	}

}
