
package org.techhub;

import java.io.*;
import java.sql.*;
import java.util.Scanner;

public class ReadStudentCSVFile {
    public static void main(String[] args) throws Exception {

        FileReader fr = new FileReader(
            "C:\\java program giri's\\JDBC\\student.csv"
        );

        BufferedReader br = new BufferedReader(fr);

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/jdbcpractice",
            "root",
            "root"
        );

        if (con != null) {

            System.out.println("Database is connected");

            Scanner in = new Scanner(System.in);

            System.out.println("Enter marks:");
            int mark = in.nextInt();

            String data;
            int value = 0;

            // Step 1: Insert CSV data into database
            String insertQuery =
                "INSERT INTO student (id, name, marks) VALUES (?, ?, ?)";

            PreparedStatement insertStmt =
                con.prepareStatement(insertQuery);

            while ((data = br.readLine()) != null) {

                String cols[] = data.split(",");

                insertStmt.setInt(1, Integer.parseInt(cols[0]));
                insertStmt.setString(2, cols[1]);
                insertStmt.setInt(3, Integer.parseInt(cols[2]));

                value = value + insertStmt.executeUpdate();
            }

            // Step 2: Display insert status only once
            if (value > 0) {
                System.out.println("Data saved successfully");
            } else {
                System.out.println("Data not saved");
            }

            // Step 3: Execute SELECT query only once
            String selectQuery =
                "SELECT * FROM student WHERE marks > ?";

            PreparedStatement selectStmt =
                con.prepareStatement(selectQuery);

            selectStmt.setInt(1, mark);

            ResultSet rs = selectStmt.executeQuery();

            boolean found = false;

            System.out.println(
                "Students scoring more than " + mark + ":"
            );

            while (rs.next()) {

                found = true;

                System.out.println(
                    rs.getInt("id") + " " +
                    rs.getString("name") + " " +
                    rs.getInt("marks")
                );
            }

            if (!found) {
                System.out.println("No students found");
            }

            rs.close();
            selectStmt.close();
            insertStmt.close();
            in.close();
            con.close();

        } else {
            System.out.println("Database is not connected");
        }

        br.close();
        fr.close();
    }
}
