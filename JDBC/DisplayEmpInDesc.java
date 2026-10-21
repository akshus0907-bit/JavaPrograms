/*Assignments 6–8 · Practice filtering, sorting, and retrieving records.
Assignment 6: Display Employees in Salary Order
Table: employees
Description: Retrieve all employees and display their details in descending order of salary.
Expected behavior:
Display employee ID, name, email, salary, and department ID.
Show the highest-paid employee first.
Allow the user to enter a minimum salary to filter the results.
Use ORDER BY to sort the results.*/





package org.techhub;
import java.util.*;
import java.sql.*;
public class DisplayEmpInDesc {
	
	public static void main(String[]args) throws Exception {
		com.mysql.cj.jdbc.Driver d= new com.mysql.cj.jdbc.Driver();
		
		
		DriverManager.registerDriver(d);
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpractice","root","root");
		
		if(con!=null) {
			Scanner in=new Scanner(System.in);
			System.out.println("database connect sucessfully");
			System.out.println("enter minimum salary");
			int min=in.nextInt();
			
			PreparedStatement stmt=con.prepareStatement("select  employee_id ,employee_name  ,salary , email,department_id from employees where salary>? order by salary asc");
			stmt.setInt(1, min);
			
			ResultSet rs= stmt.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt("employee_id") +"\t"+
						rs.getString("employee_name")+"\t"+
						rs.getInt("salary")+"\t"+
						rs.getString("email")+"\t"+
						rs.getInt("department_id"));
			}
			
		}
		else {
			System.out.println("Database not connected");
		}
	}

}
