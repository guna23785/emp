package test.com.guna.emp.model;

import com.guna.emp.model.Course;

public class TestCourse {

	public static void main(String[] args) {
		Course course = new Course();
		course.setId(1L);
		course.setName("HM");
		System.out.println(course);
	}

}
