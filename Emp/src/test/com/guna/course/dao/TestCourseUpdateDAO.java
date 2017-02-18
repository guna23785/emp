package test.com.guna.course.dao;

import com.guna.course.dao.CourseUpdateDAO;
import com.guna.emp.model.Course;

public class TestCourseUpdateDAO {

	public static void main(String[] args) throws Exception {
		Course course = new Course();
		course.setId(2l);
		course.setName("citrix");
		
		CourseUpdateDAO dao = new CourseUpdateDAO();
		dao.save(course);
		
	}

}
