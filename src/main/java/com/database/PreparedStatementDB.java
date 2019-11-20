package com.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class PreparedStatementDB {

	public static void main(String args[]) throws Exception {
		Connection con = DataBaseConnect.getConnection();
		PreparedStatement stmt=con.prepareStatement("insert into test123 values(?,?,?)");  
		stmt.setString(1,"Karthick");//1 specifies the first parameter in the query  
		stmt.setInt(2,32); 
		stmt.setString(3,"Automation Analyst");
		  
		int i=stmt.executeUpdate();  
		System.out.println(i+" records inserted"); 
		Statement stmt1=con.createStatement();  
		ResultSet rs=stmt1.executeQuery("select * from test123"); 
		while(rs.next()) {
			System.out.println(rs.getString(1)+ "   "+rs.getInt(2)+"  "+rs.getString(3));
		}
	con.close();
		
		
		con.close();  
	}
}
