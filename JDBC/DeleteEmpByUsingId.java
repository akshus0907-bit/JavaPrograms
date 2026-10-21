/*Assignment 3: Delete an Employee
Table: employees
Description: Delete an employee using their employee ID.
Expected behavior:
Accept an employee ID as input.
Delete the corresponding employee using PreparedStatement.
Display whether a record was deleted.
Consider foreign key relationships with employee_projects before deleting an employee.*/






package org.techhub;
import java.util.*;
import java.sql.*;

public class DeleteEmpByUsingId {
	public static void main(String[]args)throws Exception {
		
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		
		DriverManager.registerDriver(d);
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpractice","root","root");
		
		if(con!=null) {
			System.out.println("Database coccected Sucessfully");
			Scanner in=new Scanner(System.in);
			System.out.println("enter employee id");
			int id=in.nextInt();
			
			
			
			PreparedStatement stmt=con.prepareStatement("delete from employees where employee_id=?");
			ResultSet rs=stmt.executeQuery("select employee_id from employee_projects where employee_id="+id);
			
			if(rs.next()) {
				int projrow=stmt.executeUpdate("delete from employee_projects where employee_id="+id);
				
				System.out.println("Project record deleted sucessfully :"+projrow);
				
				 int value = stmt.executeUpdate(
				        "DELETE FROM employees WHERE employee_id = " +id
				    );

			
			if(value>0) {
				System.out.println("Employee deleted sucessfully");
			}
			else {
				System.out.println("Employee not deleted");
			}
				
			}
			else {
				System.out.println("employee id not exits");
			}
			
		
	}
		else{
			System.out.println("Database not connected sucessfully");
		}
	}

}
