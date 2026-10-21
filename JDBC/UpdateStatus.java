/*Assignment 5: Update Order Status
Table: orders
Description: Update an order's status based on its order ID. The user should be able to change the status to Pending, Completed, or Cancelled.
Expected behavior:
Accept order ID and the new status.
Update only the matching order.
Display the number of affected rows.
Validate the status before executing the update*/





package org.techhub;
import java.util.*;
import java.sql.*;

public class UpdateStatus {
	public static void main(String[]args)throws Exception {
		
		com.mysql.cj.jdbc.Driver d= new com.mysql.cj.jdbc.Driver();
		
		DriverManager.registerDriver(d);
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpractice","root","root");
		
		if(con!=null) {
			Scanner in=new Scanner(System.in);
			System.out.println("database is connected");
			
			System.out.println("enter order id");
			int id=in.nextInt();
			in.nextLine();
			
			System.out.println("enter order status");
			String status=in.nextLine();
			if(status.equalsIgnoreCase("pending")||status.equalsIgnoreCase("Completed")|| status.equalsIgnoreCase("cancalled"));
			
			PreparedStatement stmt=con.prepareStatement("Update orders set order_status=? where order_id=?");
			stmt.setString(1,status);
			stmt.setInt(2, id);
			
			int value=stmt.executeUpdate();	
			if(value>0) {
				System.out.println("data insert sucessfully");
				System.out.println("Affected row"+value);
			}
			else {
				System.out.println("data not insert ");
				System.out.println("Affeceted row"+value);
			}
			
		}
		else {
			System.out.println("database is not connected");
		}
	}

}
