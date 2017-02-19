package test.com.guna.empapp.dao;

import com.guna.empapp.dao.CourseDAO;
import com.guna.empapp.model.Course;

public class TestCourseDAO {

	public static void main(String[] args) throws Exception {

		Course course = new Course();
		course.setName("SQL");

		CourseDAO dao = new CourseDAO();
		dao.save(course);

		course.setId(2l);
		dao.delete(course);

	}

}
