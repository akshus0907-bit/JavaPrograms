/*Assignment 13: Find Customers Without Orders
Tables: customers, orders
Description: Identify customers who have never placed an order.
Expected behavior:
Use a LEFT JOIN between customers and orders.
Filter for customers without matching orders.
Display customer ID, name, email, and city.*/





package org.techhub;
import java.util.*;
import java.sql.*;

public class FindCustomerWithOutOrders {
	public static void main(String[]args)throws Exception {
		
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		
		DriverManager.registerDriver(d);
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpractice","root","root");
		
		if(con!=null) {
			System.out.println("database  connected ");
			
			PreparedStatement stmt=con.prepareStatement("SELECT c.customer_id, c.customer_name, c.email, c.city\r\n"
					+ "FROM customers c\r\n"
					+ "LEFT JOIN orders o\r\n"
					+ "ON c.customer_id = o.customer_id\r\n"
					+ "WHERE o.customer_id IS NULL;");
			 ResultSet rs=stmt.executeQuery();
			 
			 while(rs.next()) {
				 System.out.println(rs.getInt("customer_id")+"\t"+
			 rs.getString("customer_name")+"\t"+
						 rs.getString("email")+"\t"+
			 rs.getString("city"));
			 }
		}
		else {
			System.out.println("database not connected");
		}
		
		
	}
	
	

}
