
/*Assignment 15: Find Departments with High Average Salaries
Tables: employees, departments
Description: Calculate the average salary for each department and display only departments whose average salary is greater than an amount entered by the user.
Expected behavior:
Accept a minimum average salary as input.
Calculate average salary using AVG().
Group employees by department.
Use HAVING to filter groups based on average salary.
Display department name and average salary.*/

package org.techhub;
import java.util.*;
import java.sql.*;

public class DepartmentWiseHighestSal {

	public static void main(String[]args)throws Exception {
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		
		DriverManager.registerDriver(d);
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpractice","root","root");
		
		if(con!=null) {
			System.out.println("database connected");
			
			Scanner in=new Scanner(System.in);
			System.out.println("enter minimum average salary");
			int minsal=in.nextInt();
			
			PreparedStatement stmt=con.prepareStatement("SELECT d.department_name, AVG(e.salary) AS avg_salary "
			           + "FROM employees e "
			           + "JOIN departments d ON d.department_id = e.department_id "
			           + "GROUP BY d.department_name "
			           + "HAVING avg_salary > ?");
			
			stmt.setInt(1, minsal);
			
			ResultSet rs=stmt.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getString("department_name")+"\t"+
			rs.getInt("avg_salary"));
			}
		}
		else {
			System.out.println("database not connected");
		}
		
		
	}
}
