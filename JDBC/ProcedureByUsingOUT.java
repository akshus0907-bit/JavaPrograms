package org.techhub;
import java.util.*;
import java.sql.*;

public class ProcedureByUsingOUT {
	public static void main(String[]args)throws Exception {
		/*com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		
		DriverManager.registerDriver(d);*/
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpractice","root","root");
		
		if(con!=null) {
			System.out.println("database is connected");
			Scanner in=new Scanner(System.in);
			System.out.println("enter id");
			int id=in.nextInt();
			
			
			CallableStatement cs=con.prepareCall("{call getSalary(?,?)}");
			cs.setInt(1, id);
			cs.registerOutParameter(2, Types.INTEGER);
			
			
			
			boolean result=cs.execute();
			
			
			if(!result) {
				int salary=cs.getInt(2);
				System.out.println("employee salary="+salary);
				
			}
			else {
				System.out.println("some problem is there");
			}
			
		}
		else {
			System.out.println("database is not connected");
		}
		
		
	}

} 