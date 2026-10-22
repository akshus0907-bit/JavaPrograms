/*Assignments 18–20 · Combine joins, grouping, filtering, and data modification.
Assignment 18: Department-Wise Project Report
Tables: departments, projects, employee_projects
Description: Generate a report showing the number of projects and total hours worked on projects for each department.
Expected behavior:
Display department name, project count, and total hours worked.
Join departments with projects and project assignments.
Use GROUP BY to create department-wise summaries.
Use HAVING to display departments with more than a specified number of projects.
Sort by total project hours.
Ensure that joins do not unintentionally inflate totals when a project has multiple employee assignments.*/

package org.techhub;
import java.util.*;
import java.sql.*;

public class DepartmentWiseProjectReport {
	public static void main(String[]args)throws Exception{
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		
		DriverManager.registerDriver(d);
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpractice","root","root");
		
		if(con!=null) {
			System.out.println("database is connectes");
			Scanner in=new Scanner(System.in);
			
			System.out.println("enter specified number of project");
			int val=in.nextInt();
			
			PreparedStatement stmt=con.prepareStatement("select d.department_name ,count(p.project_id )as project_count,"
					+ "sum(ep.hours_worked) as total_project_hours"
					+ " from departments d  "
					+ "join projects p on d.department_id=p.department_id "
					+ " join employee_projects ep on  p.project_id = ep.project_id "
					+ "group by d.department_name "
					+ "having count(p.project_id)>? "
					+ "order by project_count ");
			
			
			stmt.setInt(1, val);
			
			
			ResultSet rs=stmt.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getString("department_name")+"\t"+
			rs.getInt("project_count")+"\t+"
					+ rs.getInt("total_project_hours"));
			}
			
		}
		else {
			System.out.println("database is not connected");
		}
	}

}
