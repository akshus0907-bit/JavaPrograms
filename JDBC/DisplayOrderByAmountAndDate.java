
/*Assignment 8: Display Orders by Amount and Date
Table: orders
Description: Retrieve orders belonging to a selected status and sort them by total amount from
 highest to lowest, followed by order date from newest to oldest.
Expected behavior:
Accept an order status as input.
Display order ID, customer ID, order date, amount, and status.
Apply multiple sorting criteria using ORDER BY.*/




package org.techhub;
import java.util.*;
import java.sql.*;

public class DisplayOrderByAmountAndDate {
public static void main(String[]args) throws Exception {
	com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
	DriverManager.registerDriver(d);
	
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpractice","root","root");
	
	if(con!=null) {
		System.out.println("database connected sucessfully");
		Scanner in=new Scanner(System.in);
		System.out.println("enter order status");
		String status=in.nextLine();
		
		PreparedStatement stmt=con.prepareStatement("select order_id ,customer_id,order_date,total_amount,order_status from orders where order_status=? "
				+ "order by total_amount desc, order_date desc");
		stmt.setString(1, status);
		
		ResultSet rs=stmt.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getInt("order_id")+"\t"+
					rs.getInt("customer_id")+"\t"+
					rs.getString("order_date")+"\t"+
					rs.getInt("total_amount")+"\t"+
					rs.getString("order_status"));
			
		}
	}
	else {
		System.out.println("database not connected");
	}
}
}
