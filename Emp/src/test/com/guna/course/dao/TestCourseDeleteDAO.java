package test.com.guna.course.dao;
import com.guna.course.dao.CourseDeleteDAO;
import com.guna.emp.model.Course;

public class TestCourseDeleteDAO {

	public static void main(String[] args) throws Exception {

		Course course = new Course();
		course.setId(2l);
		
		CourseDeleteDAO dao = new CourseDeleteDAO();
		dao.save(course);
			
		}
	}


