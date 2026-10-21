package org.techhub;
import java.sql.*;
import java.util.*;

public class FetchDataUsingID {
	public static void main(String[]args) throws Exception {
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpractice","root","root");
		if(con!=null) {
			Statement stmt =con.createStatement();
		     Scanner in=new Scanner(System.in);
		     System.out.println("enter employee id");
		     int empid=in.nextInt();
		     ResultSet rs=stmt.executeQuery("Select *from employee where id="+empid);
		     
		     if(rs.next()) {
		    	 System.out.println("employee foune");
		     
		     System.out.println(rs.getInt("id")+"\t"+rs.getString("name")+"\t"+rs.getInt("salary"));
		     } else {
			System.out.println("Employee not found");
		  }
		}
	else {
		System.out.println("Database is not connected");
	}
}
}
