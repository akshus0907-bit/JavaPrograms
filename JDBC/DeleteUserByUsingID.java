package org.techhub;
import java.util.*;
import java.sql.*;

public class DeleteUserByUsingID {
public static void main(String[]args) throws SQLException {
	
	com.mysql.cj.jdbc.Driver d= new com.mysql.cj.jdbc.Driver();
	
	DriverManager.registerDriver(d);
	
	
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpractice" , "root", "root");
	
	if(con!=null) {
		System.out.println("database is connceted");
		Scanner in =new Scanner(System.in);
		
		
		System.out.println("enter id to deleted");
		int id=in.nextInt();
		
		Statement stmt=con.createStatement();
		int value=stmt.executeUpdate("delete  from emp where id="+id);
		
		if(value>0) {
		  System.out.println("ddata deleted successfully");
		  }
		else {
			System.out.println("data not deleted");
		}
		
	}
	}
	
	
 }



