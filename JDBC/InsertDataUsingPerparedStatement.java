package org.techhub;

import java.util.*;
import java.sql.*;
public class InsertDataUsingPerparedStatement {
	public static void main(String[]args) throws Exception{
		
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpractice","root","root");
		if(con!=null) {
			Scanner in=new Scanner(System.in);
			
			System.out.println("enter    name  id and salary of employee");
			
			String name=in.next();
			
			int id=in.nextInt();
			
			int salary=in.nextInt();
			
			PreparedStatement stmt=con.prepareStatement("insert into employee values(?,?,?)");
			
		
			
			stmt.setString(1,name);
			stmt.setInt(2,id);
			stmt.setInt(3,salary);
			int value=stmt.executeUpdate();
			
			if(value>0) {
				System.out.println("record save sucessfully");
				
			}
			else {
				System.out.println("record not save sucessfully");
			}
		}
		else {
		   System.out.println("Data base not connceted");
		}
		
		
	}

}
