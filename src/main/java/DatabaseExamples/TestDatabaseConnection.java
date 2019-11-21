package DatabaseExamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDatabaseConnection {

	public static void main(String[] args) throws Exception {

		Connection con = DataBaseConnect.getConnection();
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from test123");  
		while(rs.next()) { 
			System.out.println(rs.getString(1)+"  "+rs.getInt(2)+"  "+rs.getString(3));  
			
		}
		con.close();  

	}
	}
