package org.techhub;
import java.sql.*;
import java.util.*;
public class JDBCInputFromUser {
	
	public static void main(String[]args)throws Exception {
		com.mysql.cj.jdbc.Driver d= new com.mysql.cj.jdbc.Driver();
		
		DriverManager.registerDriver(d);
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpractice" , "root", "root");
		
		if(con!=null) {
			
			Scanner in =new Scanner(System.in);
			System.out.println("database conncetes");
			System.out.println("enter name ,id,salary of employee");
			String name=in.next();
			int id=in.nextInt();
			
			int salary=in.nextInt();
			
			Statement stst=con.createStatement();

int value = stst.executeUpdate(
    "INSERT INTO emp VALUES ("+id+", '"+name+"', "+salary+")"
);

			
			if(value>0) {
				System.out.println("data save succcessfully");
			}
			else {
			     System.out.println("data not save ");
			}
			}
			
			
		
		else {
		System.out.println("database is not connceted");
		}
		
		}
		
	}


