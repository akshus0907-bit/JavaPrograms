/*Assignment 19: Update Salary Based on Department
Tables: employees, departments
Description: Increase the salary of employees working in a department selected by the user. 
The user provides the department ID and the percentage increase.
Expected behavior:
Accept department ID and percentage increase.
Update all employees belonging to that department.
Use a parameterized UPDATE statement.
Display the number of employees updated.
Validate the percentage and use a transaction if the operation requires additional database changes.
Verify the updated salaries using a JOIN query.
*/


package org.techhub;

import java.sql.*;
import java.util.Scanner;

public class UpdateSalaryBaseOnDepartment{

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/akshdb",
                "root",
                "your_password"
        );

        System.out.println("Database connected successfully");

        System.out.println("Enter department ID:");
        int deptId = sc.nextInt();

        System.out.println("Enter salary increase percentage:");
        double percentage = sc.nextDouble();

        if (percentage <= 0 || percentage > 100) {
            System.out.println(
                    "Invalid percentage! Enter between 0 and 100."
            );
            con.close();
            sc.close();
            return;
        }

        con.setAutoCommit(false);

        String updateQuery =
                "UPDATE employees " +
                "SET salary = salary + (salary * ? / 100) " +
                "WHERE department_id = ?";

        PreparedStatement ps = con.prepareStatement(updateQuery);

        ps.setDouble(1, percentage);
        ps.setInt(2, deptId);

        int rows = ps.executeUpdate();

        if (rows > 0) {

            con.commit();

            System.out.println(
                    rows + " employee(s) salary updated successfully."
            );

            String selectQuery =
                    "SELECT e.id, e.name, e.salary, d.department_name " +
                    "FROM employees e " +
                    "INNER JOIN departments d " +
                    "ON e.department_id = d.department_id " +
                    "WHERE e.department_id = ?";

            PreparedStatement ps2 =
                    con.prepareStatement(selectQuery);

            ps2.setInt(1, deptId);

            ResultSet rs = ps2.executeQuery();

            System.out.println("\nUpdated Employee Details:");

            System.out.println(
                    "ID\tName\tSalary\tDepartment"
            );

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + "\t" +
                        rs.getString("name") + "\t" +
                        rs.getDouble("salary") + "\t" +
                        rs.getString("department_name")
                );
            }

            rs.close();
            ps2.close();

        } else {

            con.rollback();

            System.out.println(
                    "No employees found for department ID: " + deptId
            );
        }

        ps.close();
        con.close();
        sc.close();
    }
}
