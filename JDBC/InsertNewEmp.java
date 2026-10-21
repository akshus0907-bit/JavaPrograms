package org.techhub;
import java.sql.*;
import java.util.*;



public class InsertNewEmp {

	public static void main(String[]args) throws Exception {

		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();


		DriverManager.registerDriver(d);

		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpractice" , "root", "root");

		if(con!=null) {
			System.out.println("Database connect sucessfully");

			Scanner in=new Scanner(System.in);

			System.out.println("enter id ,name ,email,salary,department id ,joining date and city");
			int id=in.nextInt();

			String name=in.next();
			String email=in.next();

			int salary=in.nextInt();
			int department_id=in.nextInt();
			in.nextLine();
			String joining_date=in.nextLine();
			String city=in.nextLine();


			Statement stmt=con.createStatement();


			ResultSet rs=stmt.executeQuery("select id from employee where id="+id);
			if(rs.next()) {
				System.out.println("id already persent");
			}

			ResultSet rs1 = stmt.executeQuery(
				    "SELECT email FROM employees WHERE email='" + email + "'"
				);
			if(rs1.next()) {
				System.out.println("email already present");
			}

			int value=stmt.executeUpdate("insert into employees values("+id+",'"+name+"',"
					+ "'"+email+"',"+salary+","
							+ ""+department_id+","
									+ "'"+joining_date+"',"
											+ "'"+city+"')");



			if(value>0) {
				System.out.println("data insert sucessfully");

			}
			else {
				System.out.println("Data not insert sucessfully");
			}


		}
		else {
			System.out.println("Database not conncect sucessufully");
		}

	}

}