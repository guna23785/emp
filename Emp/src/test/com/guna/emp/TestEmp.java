package test.com.guna.emp;
import java.sql.Connection;
import java.sql.DriverManager;
import com.guna.emp.Emp;
import com.guna.emp.Project;


public class TestEmp {
	
	public static void main(String[] args) throws Exception {
		
		getConnection();
		Emp emp = new Emp();
		
		emp.setId(1);
		emp.setName("guna");
		emp.setLocation("chennai");
		
		Project project = new Project();
		project.setId(101);
		project.setName("MonkeyProject");
		emp.setProject(project);
		System.out.println(emp);

	}

	public static Connection getConnection() throws Exception{
		try{
			
			String driver = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/emp_db";
			String user = "root";
			String password = "root";
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("connected");
			return con;
			
		}
		catch(Exception e) {System.out.println(e);}

		return null;
	}
}
