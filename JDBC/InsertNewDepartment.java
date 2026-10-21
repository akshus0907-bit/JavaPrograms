/*Assignment 4: Insert a New Department
Table: departments
Description: Create a program that inserts a new department using a department name and location provided by the user.
Expected behavior:
Accept department name and location.
Insert the department into the database.
Display the generated department ID if available.
Handle database errors appropriately.*/



package org.techhub;
import java.util.*;
import java.sql.*;

public class InsertNewDepartment {
	public static void main(String[]args)throws Exception {
		
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
	
		DriverManager.registerDriver(d);
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpractice","root","root");
		if(con!=null) {
			System.out.println("database connected sucessfully");
			
		Scanner in=new Scanner(System.in);
		System.out.println("enter department name and location");
		
		String Dept_name=in.nextLine();
		String location=in.nextLine();
		
		PreparedStatement ps = con.prepareStatement(
			    "INSERT INTO departments (department_name, location) VALUES (?, ?)"
			);

			ps.setString(1, Dept_name);
			ps.setString(2, location);

			int result = ps.executeUpdate();

			if (result > 0) {
			    System.out.println("Department added successfully");
			} else {
			    System.out.println("Department not added");
			}
		}
		else {
			System.out.println("Database not Connected Sucessfully");
		}
	}

}
