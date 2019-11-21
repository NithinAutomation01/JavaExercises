package DatabaseExamples;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBaseConnect {

	public static Connection getConnection() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/nithin","root","root");  
		//here sonoo is database name, root is username and password  
		 return con;
		
	}
}
