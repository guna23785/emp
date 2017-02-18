package test.com.guna.course.dao;

import com.guna.course.dao.CourseDAO;
import com.guna.emp.model.Course;

public class TestCourseDAO {

	public static void main(String[] args) throws Exception {
		
		Course course = new Course();
		course.setName("SQL");
		
		CourseDAO dao = new CourseDAO();
		dao.save(course);
		
		
	}

}
