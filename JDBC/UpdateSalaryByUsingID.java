/*Assignment 2: Update Employee Salary
Table: employees
Description: Increase or change the salary of an employee based on the employee ID entered by the user.
Expected behavior:
Accept employee ID and new salary.
Update only the employee matching the specified ID.
Display the number of affected rows.
Handle the case where the employee ID does not exist.*/




package org.techhub;
import java.sql.*;
import java.util.*;

public class UpdateSalaryByUsingID {
	
	public static void main(String[]args)throws Exception {
		
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		
		DriverManager.registerDriver(d);
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpractice","root","root");
		
		if(con!=null) {
			Scanner in=new Scanner(System.in);
			System.out.println("Database connected Sucessfully");
			
			System.out.println("enter employee id");
			int id=in.nextInt();
			
			System.out.println("enter salary of employee wnat to update ");
			int salary=in.nextInt();
			
			Statement stmt=con.createStatement();
			int value=stmt.executeUpdate(
				    "UPDATE employees SET salary=" + salary + " WHERE employee_id=" + id
					);
			
			if(value>0) {
				System.out.println("Salary update sucessfully");
				System.out.println("Affected row:"+value);
			}
			else {
				System.out.println("salary not updated");
				System.out.println("affected row"+value);
			}
		}
		else {
			System.out.println("database not connected");
		}
	}

}
