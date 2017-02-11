package test.com.guna.emp;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestConnection {

	public static void main(String[] args) {
		
		try {
			getConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}

	public static Connection getConnection() throws Exception{
		try{
			
			String driver = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/emp_db";
			String user = "roott";
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
