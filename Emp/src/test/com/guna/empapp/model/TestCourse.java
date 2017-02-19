package test.com.guna.empapp.model;

import com.guna.empapp.model.Course;

public class TestCourse {

	public static void main(String[] args) {
		Course course = new Course();
		course.setId(1L);
		course.setName("HM");
		System.out.println(course);
	}

}
