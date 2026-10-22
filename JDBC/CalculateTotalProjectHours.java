/*Assignment 16: Calculate Total Project Hours
Tables: employees, employee_projects, projects
Description: Calculate the total number of hours worked by employees on each project.
Expected behavior:
Display project name and total hours worked.
Use SUM() and GROUP BY.
Use HAVING to display projects whose total hours exceed a user-provided value.
Sort projects by total hours in descending order.*/





package org.techhub;
import java.util.*;
import java.sql.*;

public class CalculateTotalProjectHours {
	
	public static void main(String[]args)throws Exception  {
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		
		DriverManager.registerDriver(d);
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpractice","root","root");
		
		if(con!=null) {
			Scanner in=new Scanner(System.in);
			System.out.println("database is connected");
			
			System.out.println("enter hours value");
			int hr=in.nextInt();
			
			PreparedStatement stmt=con.prepareStatement("select p.project_name ,sum(ep.hours_worked) as hours "
					+ "from employees e join employee_projects ep on e.employee_id =ep.employee_id join projects p "
					+ "on p.project_id=ep.project_id group by p.project_name  having hours>?  order by hours desc");
		
		stmt.setInt(1, hr);
		
		ResultSet rs=stmt.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getString("project_name")+"\t"+
		rs.getInt("hours"));
		}
		}
		else {
			System.out.println("database is not connected");
		}
		
	}

}
