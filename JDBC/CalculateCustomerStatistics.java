/*Assignment 17: Calculate Customer Order Statistics
Tables: customers, orders
Description: Generate a report containing the number of orders and total order value for each customer.
Expected behavior:
Display customer name, total number of orders, and total order amount.
Use COUNT() and SUM().
Group records by customer.
Use HAVING to show customers whose total order amount exceeds a specified value.
Sort the results by total order amount in descending order.*/



package org.techhub;

import java.util.*;
import java.sql.*;
public class CalculateCustomerStatistics {
	
	public static void main(String[]args) throws Exception{
		
		com.mysql.cj.jdbc.Driver d= new com.mysql.cj.jdbc.Driver();
		
		DriverManager.registerDriver(d);
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpractice","root","root");
		
		if(con!=null) {
			System.out.println("database is connected");
			Scanner in=new Scanner(System.in);
			System.out.println("enter specified value");
			int val=in.nextInt();
			
			PreparedStatement stmt=con.prepareStatement("select c.customer_name ,count(o.order_id) as total_order ,"
					+ "sum(o.total_amount) as total_amount from customers c join orders o on c.customer_id=o.customer_id group by c.customer_name "
					+ "having sum(total_amount)>? order by total_amount desc ");
			
			
			stmt.setInt(1, val);
			
			ResultSet rs=stmt.executeQuery();
			
			System.out.println("Customer Name\tTotal Orders\tTotal Amount");
			System.out.println("--------------------------------------------");
			
			while(rs.next()) {
				System.out.println(rs.getString("customer_name")+"\t"+
			      rs.getInt("total_order")+"\t"+
						rs.getInt("total_amount"));
		
			}
			  
		}
		else {
			System.out.println("database is not connected");
		}
		
		
		}

}
