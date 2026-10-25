package org.techhub;

import java.io.*;
import java.sql.*;
public class ReadCSVApplicationBatch {
	public static void main(String[]args) throws Exception{

        FileReader fr = new FileReader(
            "C:\\java program giri's\\JDBC\\student.csv"
        );
        
        BufferedReader br=new BufferedReader(fr);
        String data;
        int value[];
        
       Class.forName("com.mysql.cj.jdbc.Driver");
       
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpractice","root","root");
       if(con!=null) {
    	   PreparedStatement stmt=con.prepareStatement("insert into employee values(?,?,?)");
    	   while((data=br.readLine())!=null) {
    		   String cols[]=data.split(",");
    		   
    		   
				stmt.setInt(1, Integer.parseInt(cols[0]));
				stmt.setString(2,cols[1]);
				stmt.setInt(3, Integer.parseInt(cols[2]));
				stmt.addBatch();

    	   }
    	   value=stmt.executeBatch();
    	   if(value.length>0)
    		   
    	   {
    		   System.out.println("save in database");
    		   
    	   }
       }
    	   else{
    		   System.out.println("not save");
    	   }
    	   
	}

}
