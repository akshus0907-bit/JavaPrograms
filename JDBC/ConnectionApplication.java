
package org.techhub;

import java.sql.Connection;
import java.sql.*;
import java.sql.DriverManager;

public class ConnectionApplication {

    public static void main(String[] args) throws SQLException {
  
        String url = "jdbc:mysql://localhost:3306/jdbcpractice";
        String username = "root";
        String password = "root";

        Connection con = DriverManager.getConnection(
                url, username, password);

        if(con!=null) {
        	System.out.println("database is conncect");
        	Statement stmt=con.createStatement();
        	int value=stmt.executeUpdate("insert into employee values(1,'ram',1000)");
        	if(value>0) {
        		System.out.println("record save sucessfully");
        	}
        	else {
        		System.out.println("record not save in databse");
        	}
        	}
        	
        	
        else {
        	 System.out.println("database is not conncet");
        }
        con.close();
        
        }

       
    }

