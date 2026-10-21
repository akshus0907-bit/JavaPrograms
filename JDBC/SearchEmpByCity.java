/*Assignment 7: Search Employees by City
Table: employees
Description: Retrieve employees belonging to a city entered by the user and display them in alphabetical order by employee name.
Expected behavior:
Accept a city name as input.
Filter employees using a parameterized condition.
Sort the matching records by employee name.
Display a suitable message when no employees match.*/





package org.techhub;
import java.util.*;
import java.sql.*;
public class SearchEmpByCity {

	public static void main(String[]args) throws Exception{
	
	com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
	
	DriverManager.registerDriver(d);
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpractice","root","root");
	
	if(con!=null) {
		System.out.println("Database connected");
		
		
		Scanner in=new Scanner(System.in);
		System.out.println("enter city name");
		String city=in.next();
		
		PreparedStatement stmt=con.prepareStatement("select *from employees where city=?");
		stmt.setString(1,city);
		ResultSet rs= stmt.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getInt("employee_id") +"\t"+
					rs.getString("employee_name")+"\t"+
					rs.getInt("salary")+"\t"+
					rs.getString("email")+"\t"+
					rs.getInt("department_id")+"\t"+rs.getString("City"));
		}
		
		
	}
	else{
		System.out.println("database not connected");
	}
	}
}
