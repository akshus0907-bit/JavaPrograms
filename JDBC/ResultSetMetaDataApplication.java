
package org.techhub;

import java.sql.*;

public class ResultSetMetaDataApplication {

    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/jdbcpractice",
            "root",
            "root"
        );

        PreparedStatement stmt =
            con.prepareStatement("SELECT * FROM student");

        ResultSet rs = stmt.executeQuery();

        // JDBC ResultSetMetaData
        ResultSetMetaData rsmd =
            rs.getMetaData();

        int count = rsmd.getColumnCount();

        System.out.println("Total columns: " + count);

        for (int i = 1; i <= count; i++) {

            System.out.println("Column Name: "
                    + rsmd.getColumnName(i));

            System.out.println("Column Type: "
                    + rsmd.getColumnTypeName(i));

            System.out.println("Column Display Size: "
                    + rsmd.getColumnDisplaySize(i));

            System.out.println("--------------------");
        }

        rs.close();
        stmt.close();
        con.close();
    }
}
