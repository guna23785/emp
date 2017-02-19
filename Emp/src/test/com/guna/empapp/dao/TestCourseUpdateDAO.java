package test.com.guna.empapp.dao;

import com.guna.empapp.dao.CourseDAO;

import com.guna.empapp.model.Course;

public class TestCourseUpdateDAO {

	public static void main(String[] args) throws Exception {
		Course course = new Course();
		course.setId(2l);
		course.setName("citrix");
		
		CourseDAO dao = new CourseDAO();
		dao.save(course);
		
	}

}
