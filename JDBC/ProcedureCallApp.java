package org.techhub;

import java.util.*;
import java.sql.*;

public class ProcedureCallApp {
	public static void main(String[]args) throws Exception{
		com.mysql.cj.jdbc.Driver d= new com.mysql.cj.jdbc.Driver();
		
		DriverManager.registerDriver(d);
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpractice","root","root");
		
		if(con!=null) {
			System.out.println("database is connected");
			
			CallableStatement  cstmt=con.prepareCall("{call displayEmployees()}");
			
			ResultSet rs=cstmt.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt("employee_id")+"\t"+
			rs.getString("employee_name")+"\t"+
						rs.getInt("salary"));
			}
		}
		else {
			System.out.println("database is not connected");
		}
	}

}
