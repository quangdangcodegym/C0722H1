package com.codegym.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class QueryDataExample {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {


        Connection connection = MySQLConnUtils.getMySQLConnection();

        Statement statement = connection.createStatement();



        for (int i = 5; i < 1000000; i++) {
            //insert into student (age, name, student_class_id) values (20, 'Thien', 10);
            String name = "row" + String.valueOf(i);
            String sql = String.format("insert into student (age, name, student_class_id) values (%d, '%s', %d);", i, name, 2);
            System.out.println(sql);
            int rowCount = statement.executeUpdate(sql);
        }





//        // Get Connection
//        Connection connection = MySQLConnUtils.getMySQLConnection();
//
//        // Create statement
//        Statement statement = connection.createStatement();
//
//        String sql = "Select Emp_Id, Emp_No, Emp_Name from Employee";
//
//        // Execute SQL statement returns a ResultSet object.
//        ResultSet rs = statement.executeQuery(sql);
//
//        // Fetch on the ResultSet
//        // Move the cursor to the next record.
//        while (rs.next()) {
//            int empId = rs.getInt(1);
//            String empNo = rs.getString(2);
//            String empName = rs.getString("Emp_Name");
//            System.out.println("--------------------");
//            System.out.println("EmpId:" + empId);
//            System.out.println("EmpNo:" + empNo);
//            System.out.println("EmpName:" + empName);
//        }
//
//        // Close connection.
//        connection.close();
    }
}
