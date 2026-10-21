/*Assignments 9–13 · Practice INNER JOIN, LEFT JOIN, and multiple-table joins.
Assignment 9: Display Employees with Department Names
Tables: employees, departments
Description: Retrieve employee information along with the department name in which each employee works.
Expected behavior:
Display employee ID, employee name, salary, and department name.
Use an INNER JOIN between employees and departments.
Sort the results by department name and employee name.*/


package org.techhub;
import java.util.*;
import java.sql.*;
public class DisplayEmpWithDeptName {
public static void main(String[]args)throws Exception {
	com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
	
	DriverManager.registerDriver(d);
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpractice","root","root");
	
	if(con!=null) {
		System.out.println("Database connected Sucessufully");
		PreparedStatement stmt=con.prepareStatement("select e.employee_id ,e.employee_name ,e.salary ,d.department_name from employees e join departments d where e.department_id=d.department_id ");
		ResultSet rs=stmt.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt("employee_id")+"\t"+
		rs.getString("employee_name")+"\t"+
					rs.getInt("salary")+"\t"+
		rs.getString("department_name"));
		}
	}
	else {
		System.out.println("Database is not Connected Sucessufully");
	}
}
}
