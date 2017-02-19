package test.com.guna.project.dao;

import com.guna.emp.model.Project;
import com.guna.project.dao.ProjectDAO;

public class TestProjectDAO {

	public static void main(String[] args) throws Exception {
		
	Project project = new Project();
	project.setName("Kingfisher");
	
	ProjectDAO dao = new ProjectDAO();
	dao.save(project);	

	}

}
