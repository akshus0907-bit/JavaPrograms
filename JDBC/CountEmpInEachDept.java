/*Assignment 14: Count Employees in Each Department
Tables: employees, departments
Description: Calculate the number of employees working in each department.
Expected behavior:
Display department name and employee count.
Use GROUP BY to group employees by department.
Include departments with zero employees.
Sort departments by employee count in descending order.*/




package org.techhub;
import java.util.*;
import java.sql.*;

public class CountEmpInEachDept {
	public static void main(String[]args) throws Exception{
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		
		DriverManager.registerDriver(d);
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpractice","root","root");
		
		if(con!=null) {
			System.out.println("database connected");
			PreparedStatement stmt=con.prepareStatement("select d.department_name ,count(e.employee_id) as employee_count"
					+ " from departments d left join employees e on d.department_id=e.department_id   group by d.department_name order by employee_count" );
			ResultSet rs=stmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("department_name")+"\t"+
			rs.getInt("employee_count"));
			}
			
		}
		else {
			System.out.println("database not connected");
		}
		
	}

}
