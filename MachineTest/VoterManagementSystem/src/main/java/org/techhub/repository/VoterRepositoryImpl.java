package org.techhub.repository;

import java.sql.*;

import org.techhub.model.VoterModel;


public class VoterRepositoryImpl implements VoterRepository{
	
	private Connection conn;
	private PreparedStatement stmt;
	
	public VoterRepositoryImpl() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/akshdb","root","root");
			
		}
		catch(Exception ex) {
			System.out.println("Error is "+ex);
		}
	}
	
	public boolean isAddVoter(VoterModel model) {
		try {
			stmt=conn.prepareStatement("insert into voter values('0',?,?)");
			stmt.setString(1,model.getName());
			stmt.setInt(2,model.getAge());
			
			int value=stmt.executeUpdate();
			if(value>0) {
				
				return  true;
			}
			else {
				return false;
			}
		}
		catch(Exception ex) {
			System .out.println("Error is"+ex);
			return false;
		}
	}
	
	
	public VoterModel ViewVoter(int id) {
		try {
			stmt=conn.prepareStatement("select *from voter  where id=?");
			stmt.setInt(1, id);
			ResultSet rs=stmt.executeQuery();
			
			VoterModel model=null;
			while(rs.next()) {
				
				model=new VoterModel();
			    model.setId(rs.getInt("id"));
	            model.setName(rs.getString("name"));
	            model.setAge(rs.getInt("age"));
			}
			return model;
			
			
		}
		catch(Exception ex) {
			System.out.println("error  is "+ex);
			return null;
		}
		
	}
	
}
