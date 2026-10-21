/*Assignment 11: Display Employees Assigned to Projects
Tables: employees, employee_projects, projects
Description: Retrieve the names of employees, the projects they are working on, and the number of hours they have worked on each project.
Expected behavior:
Join all three tables using their related IDs.
Display employee name, project name, hours worked, and assigned date.
Filter records based on a project ID entered by the user.*/




package org.techhub;
import java.util.*;
import java.sql.*;

public class DisplayEmpAssignedProject {

	public static void main(String[]args) throws Exception{
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		
		DriverManager.registerDriver(d);
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpractice","root","root");
		
		
		if(con!=null) {
			Scanner in =new Scanner(System.in);
			System.out.println("Database connected sucessfully");
			
			System.out.println("enter id");
			int id=in.nextInt();
			PreparedStatement stmt=con.prepareStatement("select e.employee_name ,p.project_name ,ep.hours_worked ,ep.assigned_date from  employees e join projects p  on e.department_id=e.department_id join employee_projects ep ON ep.project_id = p.project_id where p.project_id=? ");
			stmt.setInt(1, id);
			ResultSet rs=stmt.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getString("employee_name")+"\t"+
						rs.getString("project_name")+"\t"+
						rs.getInt("hours_worked")+"\t"+
						rs.getDate("assigned_date"));
				}
			
			
			
		}
		else {
			System.out.println("Database not connected");
		}
	}
}
