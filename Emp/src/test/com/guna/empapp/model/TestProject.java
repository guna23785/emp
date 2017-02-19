package test.com.guna.emp.model;

import com.guna.emp.model.Project;

public class TestProject {

	public static void main(String[] args) {

		Project project = new Project();
		project.setId(001L);
		project.setName("MonkeyProject");
		System.out.println(project);		
		
	}

}
