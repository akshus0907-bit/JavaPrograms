
/*Assignment 10: Display All Departments and Their Employees
Tables: departments, employees
Description: Display every department, including departments that do not currently have employees.
Expected behavior:
Display department ID, department name, employee ID, and employee name.
Use a LEFT JOIN.
Show departments with no employees as well.
Sort the results by department name.
*/


package org.techhub;
import java.util.*;
import java.sql.*;

public class DisplayAllDeptAndEmp {
	public static void main(String[]args)throws Exception {
		
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpractice","root","root");
		
		if(con!=null) {
			System.out.println("Database connected Sucessfully");
			PreparedStatement stmt=con.prepareStatement("select d.department_id ,d.department_name ,e.employee_id,e.employee_name from departments d "
					+ "left join employees  e on  e.department_id=d.department_id  order by d.department_name asc");
			
			ResultSet rs=stmt.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt("department_id")+"\t"+
			  rs.getString("department_name")+"\t"+
						rs.getInt("employee_id")+"\t"+
			  rs.getString("employee_name"));
			}
		}
		else {
			System.out.println("Database not connected ");
		}
	}

}
